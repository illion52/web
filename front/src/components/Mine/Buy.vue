<template>
  <el-table
    :data="tableData"
    stripe
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
  </el-table>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          date: '2022-11-02',
          id: '1',
          title: '三体 / 刘慈欣 / 2019-05-05 / 重庆出版社',
          price: '58.8'
        }]
      }
    }
  }
</script>
