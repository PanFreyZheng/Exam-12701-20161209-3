# Exam-12701-20161209-3
该工程com.entity包下有三个实体类对应电影信息Film，语言信息Language，顾客信息Customer.
com.DAO下有三个实体类会用到方法的对应接口
com.DAOImpl实现了三个接口
com.filter包下是过滤器 通过loginServlet保存登录的用户名 LOGIN_USER到session中
再web.xml配置文件中将
login.jsp设为excludedPages。
com.servlet包下有页面用到的增加AddFilmServlet 删除DeleteServlet 编辑EditServlet 登录LoginServlet 展示ShowServlet 5个功能对应的Servlet
用到5个jsp界面 默认的index.jsp  通过局部刷新显示登录前和登陆后的的功能选项及提示
login.jsp登录界面 与loginServlet判断输入用户名是否存在或为空
add.jsp用于添加film信息
show.jsp界面 显示全部Film信息 并可通过编辑和删除的超链接执行编辑和删除功能
