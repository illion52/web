<template>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column type="expand">
      <template slot-scope="props">
        <el-form label-position="left" inline class="demo-table-expand">
          <el-form-item label="日期">
            <span>{{ props.row.date }}</span>
          </el-form-item>
          <el-form-item label="销售总额￥">
            <span>{{ props.row.amount }}</span>
          </el-form-item>
          <el-form-item label="增长金额￥">
            <span>{{ props.row.add }}</span>
          </el-form-item>
          <el-form-item label="最受欢迎">
            <span>{{ props.row.most }}</span>
          </el-form-item>
          <el-form-item label="描述">
            <span>{{ props.row.desc }}</span>
          </el-form-item>
        </el-form>
      </template>
    </el-table-column>
    <el-table-column
      label="日期"
      prop="date">
    </el-table-column>
    <el-table-column
      label="描述"
      prop="desc">
    </el-table-column>
  </el-table>
</template>

<style>
  .demo-table-expand {
    font-size: 0;
  }
  .demo-table-expand label {
    width: 90px;
    color: #99a9bf;
  }
  .demo-table-expand .el-form-item {
    margin-right: 0;
    margin-bottom: 0;
    width: 50%;
  }
</style>

<script>
  export default {
    data() {
      return {
        tableData: [{
          date: '2022-11-02',
          amount: '5000',
          add: '25',
          desc: '中',
          most: '三体 / 刘慈欣 / 2019-05-05 / 重庆出版社',
        }]
      }
    }
  }
</script>
