<template>
  <el-card class="admin-header">
    <a href="/index">
      <img src="../../assets/logo.png" alt="" width="55px" style="float: left;margin-top: -5px;">
    </a>
    <span style="font-size: 32px;font-weight: bold;position:absolute;left: 100px">管理系统</span>
  </el-card>
</template>

<script>
  import {createRouter} from '../../router'

  export default {
    name: 'Header'
  }
</script>

<style scoped>
  .admin-header {
    height: 80px;
    opacity: 0.85;
    line-height: 40px;
    min-width: 900px;
  }
  .el-icon-switch-button {
    cursor: pointer;
    outline:0;
  }
</style>
