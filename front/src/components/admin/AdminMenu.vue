<template>
  <div>
    <el-radio-group v-model="isCollapse" style="margin-bottom: 50px;margin-left:-80px;padding-top: 120px">
      <el-radio-button :label="false">展开</el-radio-button>
      <el-radio-button :label="true">收起</el-radio-button>
    </el-radio-group>
  <el-menu
    :default-active="'/index'"
    router
    class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" :collapse="isCollapse">
    <el-submenu>
      <template slot="title">
        <i class="el-icon-location"></i>
        <span slot="title">报表与信息</span>
      </template>
      <el-menu-item-group>
        <el-menu-item index="chart">报表</el-menu-item>
        <el-menu-item index="chart_user">用户记录</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
    <el-menu-item index="manage">
      <i class="el-icon-menu"></i>
      <span slot="title">管理</span>
    </el-menu-item>
  </el-menu>

  </div>
</template>

<script>
  export default {
    data() {
      return {
        isCollapse: true
      };
    },
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style>
  .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
  }
</style>
