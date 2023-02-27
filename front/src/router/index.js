import Vue from 'vue'
import Router from 'vue-router'
import AppIndex from '@/components/home/AppIndex'
import Login from '@/components/Login'
import HOME from "@/components/HOME"
import LibView from "@/components/Library/LibView"
import Cart from "@/components/Mine/Cart"
import Buy from "@/components/Mine/Buy"
import chart from "@/components/admin/charts/chart"
import chart_user from "@/components/admin/charts/chart_user"
import manage from "@/components/admin/manage/manage"
import Register from "@/components/Register"
Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'login',
      redirect: '/login',
      component: Login,
      meta: {
        requireAuth: true
      }
    },
    {path:'/home',
      name:'HOME',
      component:HOME,
      redirect:'/index',
      children:[
        {
          path: '/index',
          name: 'AppIndex',
          component: AppIndex,
          meta: {
            requireAuth: true
          }
        },
        {
          path:'/libview',
          name:'LibView',
          component:LibView,
          meta:{requireAuth:true
          }
        },
        {
          path: '/cart',
          name: 'Cart',
          component: Cart,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/list',
          name: 'List',
          component: Buy,
          meta: {
            requireAuth: true
          }
        }
      ]
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/register',
      name: 'Register',
      component: Register
    },
    {
      path: '/admin',
      name: 'Admin',
      component: () => import('../components/admin/AdminIndex'),
      meta: {
        requireAuth: true
      },
      children: [
        {
          path: '/chart',
          name: 'chart',
          component: chart,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/chart_user',
          name: 'chart_user',
          component: chart_user,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/manage',
          name: 'manage',
          component:manage,
          meta: {
            requireAuth: true
          }
        }
      ]
}
  ]
})
