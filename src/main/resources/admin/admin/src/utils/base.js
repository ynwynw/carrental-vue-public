const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot4c04d/",
            name: "springboot4c04d",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot4c04d/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "汽车租赁系统"
        } 
    }
}
export default base
