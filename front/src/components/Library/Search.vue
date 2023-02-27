<template>
  <div style="margin-bottom: 30px;display: flex;justify-content: center ;align-items: center">
    <el-input
      @keyup.enter.native="searchClick"
      size="small"
      style="width: 400px;margin-right: 10px"
      v-model="keywords">
    </el-input>
    <el-button size="small" icon="el-icon-search"  @click="searchClick"></el-button>
  </div>
</template>

<script>
  export default {
    name: 'SearchBar',
    data () {
      return {
        keywords: '',
        books: [],
        cardLoading: []
      }
    },
    methods: {
      searchClick () {
        this.$emit('onSearch')
      }
    }
  }
</script>

<style scoped>

</style>

