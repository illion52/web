<template>
  <el-scrollbar style="height: 100%">
  <body id="back">
    <el-carousel indicator-position="outside" type="card">
    <el-carousel-item  v-for="item in urls" :key="item">
      <a href="https://miaosha.jd.com/#100038853774">
      <img :src="item.img"  class="image multi-content">
      </a>
    </el-carousel-item>
  </el-carousel>
  <h3 class="title">今日推荐</h3>
  <br>
  <el-card class='poems' v-for="item in poems" key="poem">
    <h1 align="left" class="title" style="display: block;
    line-height: 25px">
      {{item.title}}
    </h1>
      <p  align="left" class="author">
        <a style="color: #000000" href="">{{item.author}}</a>
      </p>
    <PRE style="font-family: 'Agency FB'" align="left" class="body">{{item.body}}</PRE>
  </el-card>
  </body>
  </el-scrollbar>
</template>

<style>
  .poems{
    border-radius: 24px;
    height: 100%;
    width: 100%;
    background-clip: padding-box;
    background: #ffffff;
    padding: 40px 40px 20px 40px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
</style>

<script>
  export default {
    data(){
      return{
        urls:[
          {img:require("../../assets/view1.jpg")},
          {img:require("../../assets/view2.jpg")},
          {img:require("../../assets/view.jpg")}
        ],
        poems:[
          {
            title:"煤堆",
            author:"海子",
            body:"闯进冬天的\n" +
              "黑色主人\n" +
              "拉着大家的手\n" +
              "径直走进房屋\n" +
              "火\n" +
              "闪着光\n" +
              "把病牛牵进来！\n" +
              "它像一片又瘦又长的树叶\n" +
              "落上稻草：唉，这没有泥土的日子\n" +
              "但是煤说：\n" +
              "火\n" +
              "闪着光\n" +
              "1984.11"

          }
        ]
      }
    },
    name: 'AppIndex'
  }
</script>

<style scoped>

</style>
