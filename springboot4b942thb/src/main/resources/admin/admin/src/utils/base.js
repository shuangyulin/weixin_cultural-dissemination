const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot4b942thb/",
            name: "springboot4b942thb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot4b942thb/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的粤语文化传播平台的设计与开发"
        } 
    }
}
export default base
