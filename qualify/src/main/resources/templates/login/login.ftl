<#include "/common/common.ftl">
<html>
<body>
<form class="form-horizontal"  action="/login/form" method="post">
    <div style="margin-top: 10%">
       <div style="margin-left: 40%;">
           <h2 >用户登录</h2>
           <div class="form-group" style="margin-top: 20px">
               <div class="form-inline">
                  <label style="width: 70px">用户名：</label>
                  <input type="text" name="username"  class="form-control"  placeholder="请输入用户名"/>
               </div>
           </div>
        <div class="form-group">
            <div class="form-inline">
              <label style="width: 70px">密码：</label>
               <input type="password" name="password"  class="form-control" placeholder="请输入密码" />
            </div>
        </div>
           <div class="form-group">
             <button type="submit"  class="btn btn-primary"  >注册</button>
             <button type="submit"  class="btn btn-primary"  >登录</button>
           </div>
       </div>
    </div>
</form>
</body>
</html>