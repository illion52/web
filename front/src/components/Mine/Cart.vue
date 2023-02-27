<template>
  <div>
    <el-table
      :data="tableData.filter(data => !search || data.name.toLowerCase().includes(search.toLowerCase()))"
      style="width: 100%">
      <el-table-column
        prop="date"
        label="购买日期"
        width="180">
      </el-table-column>
      <el-table-column
        prop="title"
        label="商品名称">
      </el-table-column>
      <el-table-column
        prop="price"
        label="金额￥">
      </el-table-column>
      <el-table-column
        align="right">
        <template slot="header" slot-scope="scope">
        </template>
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)">Delete</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-button
      size="mini"
      type="primary"
      style="margin-left:1370px;margin-top: 20px"
      @click="">BUY NOW</el-button>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [
          {"id":1,"title":"三体","author":"刘慈欣","date":"2019-05-05","press":"重庆出版社","abs":"文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……","cover":"https://i.loli.net/2019/04/10/5cada7e73d601.jpg","price":58.8,"cid":1},
        ],
        search: ''
      }
    },
    methods: {
      handleEdit(index, row) {
        console.log(index, row);
      },
      handleDelete(index, row) {
        console.log(index, row);
      }
    },
  }
</script>
