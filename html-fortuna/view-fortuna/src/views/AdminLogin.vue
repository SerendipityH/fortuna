<template>
    <div class="admin_login">
        <vue-particles color="#4169E1"/>
        <div class="admin_login_context">
            <div class="avatar_box">
               登录
            </div>
            <!--form表单-->
            <el-form :model="adminLoginForm" class="admin_login_form"  ref="adminLoginForm" :rules="adminLoginFormRules">
                <el-form-item prop="username">
                    <el-input v-model="adminLoginForm.username" prefix-icon="el-icon-user"/>
                </el-form-item>
                <el-form-item prop="password">
                    <el-input type="password" v-model="adminLoginForm.password"  prefix-icon="el-icon-lock"/>
                </el-form-item>

                <el-form-item>
                    <el-button type="primary" @click="adminLogin('adminLoginForm')">提交</el-button>
                    <el-button @click="resetAdminLoginForm('ruleForm')">重置</el-button>
                </el-form-item>
            </el-form>
        </div>

    </div>
</template>

<script>
    export default {
        data() {
            return {

                adminLoginForm: {
                    username: '',
                    password: ''

                },adminLoginFormRules:{
                    username: [
                        { required: true, message: '请输入登录名', trigger: 'blur' },
                        {
                            min: 3,
                            max: 10,
                            message: '登录名长度在 3 到 10 个字符',
                            trigger: 'blur'
                        }
                    ],
                    password: [
                        { required: true, message: '请输入密码', trigger: 'blur' },
                        {
                            min: 6,
                            max: 15,
                            message: '密码长度在 6 到 15 个字符',
                            trigger: 'blur'
                        }
                    ]
                }

            }
        },
        methods: {
            //添加表单重置方法
          /*  resetAdminLoginForm() {
                //this=>当前组件对象，其中的属性$refs包含了设置的表单ref
                //   console.log(this)
                this.$refs.adminLoginFormRef.resetFields()
            },*/
            adminLogin(formName) {
                //点击登录的时候先调用validate方法验证表单内容是否有误
                this.$refs[formName].validate(async valid => {
                   // console.log(this.adminLoginFormRules);
                    //如果valid参数为true则验证通过
                    console.log(valid)
                    if (!valid) {
                        alert("error")
                    }

                    //发送请求进行登录
                  /*  const { data: res } = await this.$http.post('login', this.adminLoginForm);
                    //   console.log(res);
                    if (res.meta.status !== 200) {
                        return this.$message.error('登录失败:' + res.meta.msg) //console.log("登录失败:"+res.meta.msg)
                    }

                    this.$message.success('登录成功')
                    console.log(res)
                    //保存token
                    window.sessionStorage.setItem('token', res.data.token)
                    // 导航至/home
                    this.$router.push('/home')*/
                })
            }
        }
    }
</script>
<style scoped>
    .admin_login {
        background: url(../assets/background.jpg) no-repeat fixed center center;
        background-size: 100% 100%;
        height: 100%;
        position: fixed;
        width: 100%
    }
    .admin_login_context {
        width: 400px;
        height: 300px;
        background: #fff;
        position: absolute;
        top: 20%;
        left: 35%;
        border-radius: 8px;
        box-shadow: 0 0 2px 2px #dddddd ;
        opacity:0.3;
        align-items: center;
    }
    .admin_login_background{
        display: inline-block;
        height: auto;
        max-width: 100%;
        margin: 0;
    }
    .admin_login_form{
        position: absolute;
        bottom: 0;
        width: 100%;
        padding: 0 20px;
        box-sizing: border-box;
        margin-top:-20%;


    }


</style>
