<template>
  <el-container>
    <el-aside style="width: 200px;margin-top: 20px">
      <switch></switch>
      <SideMenu></SideMenu>
    </el-aside>
    <el-main>
      <book></book>
    </el-main>
  </el-container>
</template>

<script>
  import Book from './Book'
  import SideMenu from './SideMenu'
    export default {
        name: "LibView",
      components:{SideMenu,Book},
      methods:{
          listByCategory(){
            var _this=this
            var cid=the.$refs.SideMenu.cid
          }
      }
    }

</script>

<style scoped>

</style>
