<template>
  <el-menu
    :default-active="'/index'"
    router
    class="el-menu-demo"
    mode="horizontal"
    @select="handleSelect"
    background-color="#545c64"
    text-color="#fff"
    active-text-color="#ffd04b">
    <el-menu-item index="index">首页</el-menu-item>
    <el-menu-item index="libview">商品浏览</el-menu-item>
    <el-submenu index="index">
      <template slot="title">我的</template>
      <el-menu-item index="cart"><i class="el-icon-goods"></i>购物车</el-menu-item>
      <el-menu-item index="list"> <i class="el-icon-s-goods"></i>已购买</el-menu-item>
      <el-menu-item index="delete"> <i class="el-icon-delete"></i>注销账号</el-menu-item>
    </el-submenu>
    <el-menu-item><a href="https://www.scut.edu.cn/new/" target="_blank">关于我们</a></el-menu-item>
  </el-menu>
</template>

<script>
  export default {
    data() {
      return {
        activeIndex: '1',
        activeIndex2: '1'
      };
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>
