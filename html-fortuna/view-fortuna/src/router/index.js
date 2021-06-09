import Vue from 'vue'
import VueRouter from 'vue-router'
const AdminLogin = ()=>import('../views/AdminLogin');

Vue.use(VueRouter)

const routes = [
  {
    path:'/',
    redirect:'/admin/login',
  },
  {
    path:'/admin/login',
    name:'AdminLogin',
    component:AdminLogin
  }
]

const router = new VueRouter({
  routes
})

export default router
