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
	import yuejuxinxi from '@/views/modules/yuejuxinxi/list'
	import yinlexinxi from '@/views/modules/yinlexinxi/list'
	import discussyueyuwenhua from '@/views/modules/discussyueyuwenhua/list'
	import storeup from '@/views/modules/storeup/list'
	import discussyueyushangpin from '@/views/modules/discussyueyushangpin/list'
	import discussyueyuyingshi from '@/views/modules/discussyueyuyingshi/list'
	import forum from '@/views/modules/forum/list'
	import discussyuejuxinxi from '@/views/modules/discussyuejuxinxi/list'
	import forumtype from '@/views/modules/forumtype/list'
	import yueyuyingshi from '@/views/modules/yueyuyingshi/list'
	import wenhuafenlei from '@/views/modules/wenhuafenlei/list'
	import yonghu from '@/views/modules/yonghu/list'
	import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
	import discussyinlexinxi from '@/views/modules/discussyinlexinxi/list'
	import forumreport from '@/views/modules/forumreport/list'
	import chargerecord from '@/views/modules/chargerecord/list'
	import yueyuwenhua from '@/views/modules/yueyuwenhua/list'
	import yuejufenlei from '@/views/modules/yuejufenlei/list'
	import orders from '@/views/modules/orders/list'
	import yinlefenlei from '@/views/modules/yinlefenlei/list'
	import config from '@/views/modules/config/list'
	import yingshifenlei from '@/views/modules/yingshifenlei/list'
	import yueyushangpin from '@/views/modules/yueyushangpin/list'


//2.配置路由   注意：名字
export const routes = [{
	path: '/',
	name: '系统首页',
	component: Index,
	children: [{
		// 这里不设置值，是把main作为默认页面
		path: '/',
		name: '系统首页',
		component: Home,
		meta: {icon:'', title:'center', affix: true}
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
		path: '/yuejuxinxi',
		name: '粤剧信息',
		component: yuejuxinxi
	}
	,{
		path: '/yinlexinxi',
		name: '音乐信息',
		component: yinlexinxi
	}
	,{
		path: '/discussyueyuwenhua',
		name: '粤语文化评论',
		component: discussyueyuwenhua
	}
	,{
		path: '/storeup',
		name: '我的收藏',
		component: storeup
	}
	,{
		path: '/discussyueyushangpin',
		name: '粤语商品评论',
		component: discussyueyushangpin
	}
	,{
		path: '/discussyueyuyingshi',
		name: '粤语影视评论',
		component: discussyueyuyingshi
	}
	,{
		path: '/forum',
		name: '交流论坛',
		component: forum
	}
	,{
		path: '/discussyuejuxinxi',
		name: '粤剧信息评论',
		component: discussyuejuxinxi
	}
	,{
		path: '/forumtype',
		name: '论坛分类',
		component: forumtype
	}
	,{
		path: '/yueyuyingshi',
		name: '粤语影视',
		component: yueyuyingshi
	}
	,{
		path: '/wenhuafenlei',
		name: '文化分类',
		component: wenhuafenlei
	}
	,{
		path: '/yonghu',
		name: '用户',
		component: yonghu
	}
	,{
		path: '/shangpinfenlei',
		name: '商品分类',
		component: shangpinfenlei
	}
	,{
		path: '/discussyinlexinxi',
		name: '音乐信息评论',
		component: discussyinlexinxi
	}
	,{
		path: '/forumreport',
		name: '举报记录',
		component: forumreport
	}
	,{
		path: '/chargerecord',
		name: '充值记录',
		component: chargerecord
	}
	,{
		path: '/yueyuwenhua',
		name: '粤语文化',
		component: yueyuwenhua
	}
	,{
		path: '/yuejufenlei',
		name: '粤剧分类',
		component: yuejufenlei
	}
	,{
		path: '/orders/:status',
		name: '订单管理',
		component: orders
	}
	,{
		path: '/yinlefenlei',
		name: '音乐分类',
		component: yinlefenlei
	}
	,{
		path: '/config',
		name: '轮播图管理',
		component: config
	}
	,{
		path: '/yingshifenlei',
		name: '影视分类',
		component: yingshifenlei
	}
	,{
		path: '/yueyushangpin',
		name: '粤语商品',
		component: yueyushangpin
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}
export default router;
