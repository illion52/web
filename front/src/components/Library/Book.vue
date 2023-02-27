<template>
  <div>
    <el-row style="height: 900px;">
      <search-bar @onSearch="searchResult" ref="search"></search-bar>
      <el-tooltip effect="dark" placement="right"
                  v-for="item in books.slice((currentPage-1)*pagesize,currentPage*pagesize)"
                  :key="item.id">
        <p slot="content" style="font-size: 14px;margin-bottom: 6px;">{{item.title}}</p>
        <p slot="content" style="font-size: 13px;margin-bottom: 6px">
          <span>{{item.author}}</span> /
          <span>{{item.date}}</span> /
          <span>{{item.press}}</span>
        </p>
        <p slot="content" style="width: 300px" class="abstract">{{item.abs}}</p>
        <el-card style="width: 135px;margin-bottom: 20px;height: 270px;float: left;margin-right: 15px" class="book"
                 bodyStyle="padding:10px" shadow="hover">
          <div class="cover">
            <img :src="item.cover" alt="封面">
          </div>
          <div class="info">
            <div class="title">
              <a href="">{{item.title}}</a>
            </div>
          </div>
          <div class="author" >{{item.author}}</div>
          <div class="info">￥{{item.price}} <el-button size="small" type="primary"   @click="buy">BUY</el-button></div>
        </el-card>

      </el-tooltip>
    </el-row>
    <el-row>
      <el-pagination
        :current-page="1"
        :page-size="10"
        :total="20">
      </el-pagination>
    </el-row>
  </div>
</template>

<script>
  import SearchBar from './Search'
  //import ViewSwitch from './ViewSwitch'

  export default {
    name: 'Book',
    components: {SearchBar},
    data () {
      return {
        books: [],
        currentPage: 1,
        pagesize: 18
      }
    },
    mounted: function () {
      this.loadBooks()
    },
    //传递储存在数据库中的图书信息
    methods: {
      loadBooks () {
        console.log(this)
        var _this = this
        this.$axios.get('/books').then(resp=>{
          if (resp&&resp.data.code===200) {
            _this.books = resp.data.result
          }
        })
          .catch(function (error) {

          })
      },
      handleCurrentChange: function (currentPage) {
        this.currentPage = currentPage
      },
      buy(){
        this.$axios
          .post('/buy').then(resp=>{
            if(resp&&resp.data.code===200){
              this.$alert('购买成功', '提示', {
                confirmButtonText: '确定'})
            }
        })
      },
      searchResult () {
        var _this=this
        this.$axios
          .get('/search?keywords='+ this.$refs.search.keywords, {
          }).then(resp => {
          if (resp && resp.data.code === 200) {
            _this.books = resp.data.result
          }
        })
      }
    }
  }
</script>


<style scoped>
  .cover {
    width: 115px;
    height: 172px;
    margin-bottom: 7px;
    overflow: hidden;
    cursor: pointer;
  }

  img {
    width: 115px;
    height: 172px;
    /*margin: 0 auto;*/
  }

  .title {
    font-size: 14px;
    text-align: left;
  }

  .author {
    color: #333;
    width: 102px;
    font-size: 13px;
    margin-bottom: 6px;
    text-align: left;
  }

  .abstract {
    display: block;
    line-height: 17px;
  }

  a {
    text-decoration: none;
  }

  a:link, a:visited, a:focus {
    color: #3377aa;
  }
</style>

