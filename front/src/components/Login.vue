<template>
  <body id="back">
  <el-form label-position="left" label-width="0px" c class="login">
    <h3 class="title">登录</h3>
    <el-form-item>
      <el-input type="text" v-model="loginForm.username" auto-complete="off" placeholder="请输入用户名"></el-input>
    </el-form-item>
    <br>
    <el-form-item>
      <el-input type="password" v-model="loginForm.password" auto-complete="off" placeholder="请输入密码" show-password=""></el-input>
    </el-form-item>
    <br>
    <el-form-item style="width: 100%">
      <el-button type="primary" style="width:100%;background: darkgrey;" @click="login">submmit</el-button>
    </el-form-item>
    <a style="color: #000000" href="\register">sign up</a>
  </el-form>
  </body>
</template>

<script>
  /* eslint-disable */
  export default {
    name: 'Login',
    data () {
      return {
        loginForm: {
          username: '',
          password: ''
        },
        responseResult: []
      }
    },
    methods: {
      login () {
        this.$axios.post('/login', {
            username: this.loginForm.username,
            password: this.loginForm.password
          })
          .then(successResponse => {
            if (successResponse.data.code === 200) {

              this.$message({
                message: '登陆成功！',
                type: 'success',
              });
              this.$router.replace({path: '/index'})
            }
            else if (successResponse.data.code==400){
              this.$message.error('密码错误或无此账号，登陆失败！');
                }
              })
          .catch(failResponse => {
          })
      }
    }
  }
</script>
<style>
  .login{
    border-radius: 24px;
    margin: 200px auto;
    width: 400px;
    background-clip: padding-box;
    background: mintcream;
    padding: 40px 40px 20px 40px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)
  }
  #back{
    background:url("../assets/view2.jpg");
    background-position: center;
    height: 100%;
    width: 100%;
    background-size: cover;
    position: fixed;
  }
  body{
    margin: 0px;
  }
</style>
