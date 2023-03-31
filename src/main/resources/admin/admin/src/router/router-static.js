import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zulindingdanliebiao from '@/views/modules/zulindingdanliebiao/list'
    import haichejilu from '@/views/modules/haichejilu/list'
    import cheliangpinpai from '@/views/modules/cheliangpinpai/list'
    import discusscheliangxinxi from '@/views/modules/discusscheliangxinxi/list'
    import cheliangxinxi from '@/views/modules/cheliangxinxi/list'
    import cheliangyanse from '@/views/modules/cheliangyanse/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import users from '@/views/modules/users/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/zulindingdanliebiao',
        name: '租赁订单列表',
        component: zulindingdanliebiao
      }
          ,{
	path: '/haichejilu',
        name: '还车记录',
        component: haichejilu
      }
          ,{
	path: '/cheliangpinpai',
        name: '车辆品牌',
        component: cheliangpinpai
      }
          ,{
	path: '/discusscheliangxinxi',
        name: '车辆信息评论',
        component: discusscheliangxinxi
      }
          ,{
	path: '/cheliangxinxi',
        name: '车辆信息',
        component: cheliangxinxi
      }
          ,{
	path: '/cheliangyanse',
        name: '车辆颜色',
        component: cheliangyanse
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
