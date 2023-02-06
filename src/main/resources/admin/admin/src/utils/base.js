const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootl595p/",
            name: "springbootl595p",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "在线办公系统"
        } 
    }
}
export default base
