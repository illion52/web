<template>
    <div>
      <guide-menu></guide-menu>
      <router-view/>
    </div>
</template>

<script>
    import GuideMenu from './com/GuideMenu'
    export default {
        name: "HOME",
        components:{GuideMenu}
    }
</script>

<style scoped>

</style>
