1.需求分析
2.数据库设计
    1)实体分析
        -图书             Book
        -用户             User
        -订单             OrderBean
        -购物车项         CartItem
        -订单详情         OrderItem
   2)实体属性分析
        -图书:书名、作者、价格、销量、库存、封面、状态
        -用户:用户名、密码、邮箱
        -订单:订单编号、订单日期、订单金额、订单数量、订单状态、用户
        -订单详情:图书、数量、所属订单
        -购物车项:图书、数量、所属用户

购物车中书本数量的加减有问题，没有解决

注册页面表单验证
    1)<form>有一个事件 onsubmit
        onsubmit="return false"，那么表单点击提交按钮时不会提交
        onsubmit="return true"，那么表单点击提交按钮时会提交

    2)获取文档中某一个结点的方式：
        //DOM
        // var unameTxt = document.getElementById("unameTxt");
        //BOM
        // document.forms[0].uname

原生的Ajax（了解）
    1.<input type="text" name="uname" onblur="ckUname"/>
    2.定义ckUname方法：
        -创建XMLHttpRequest对象
        -XMLHttpRequest对象操作步骤:
            -open(url,"GET",true)
            -onreadystatechange 设置回调
            -send() 发送请求
        -在回调函数中需要判断XMLHttpRequest对象的状态:
            readyState(0-4),status(200)