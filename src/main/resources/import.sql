DROP TABLE IF EXISTS goods;
CREATE TABLE goods(id INT PRIMARY KEY AUTO_INCREMENT, project_url VARCHAR(40) NOT NULL,complete_percent INT, left_time INT, current_fund INT
,fund_type VARCHAR(40) DEFAULT 'DEFUALT',img_url VARCHAR(40) DEFAULT 'DEFUALT',platform VARCHAR(40) DEFAULT 'DEFUALT',project_name VARCHAR(40) DEFAULT 'DEFUALT',status VARCHAR(40) DEFAULT 'DEFUALT');

insert into goods (project_url, complete_percent, left_time
,current_fund,fund_type,img_url,platform,project_name,status)
values ('https://www.baidu.com/',30,20,998,'success','https://www.baidu.com/img/bd_logo1.png'
,'baidu','test name','success');

insert into goods (project_url, complete_percent, left_time
  ,current_fund,fund_type,img_url,platform,project_name,status)
values ('https://www.jingdong.com/',30,20,998,'not success','https://www.baidu.com/img/bd_logo1.png'
  ,'jingdong','test name','not success');

insert into goods (project_url, complete_percent, left_time
  ,current_fund,fund_type,img_url,platform,project_name,status)
values ('https://www.baidu.com/',30,20,998,'half success','https://www.baidu.com/img/bd_logo1.png'
  ,'taobao','test name','half success');

insert into goods (project_url, complete_percent, left_time
  ,current_fund,fund_type,img_url,platform,project_name,status)
values ('https://www.baidu.com/',30,20,998,'success','https://www.baidu.com/img/bd_logo1.png'
  ,'taobao','test name','success');

insert into goods (project_url, complete_percent, left_time
  ,current_fund,fund_type,img_url,platform,project_name,status)
values ('https://www.jingdong.com/',30,20,998,'not success','https://www.baidu.com/img/bd_logo1.png'
  ,'baidu','test name','not success');

insert into goods (project_url, complete_percent, left_time
  ,current_fund,fund_type,img_url,platform,project_name,status)
values ('https://www.baidu.com/',30,20,998,'half success','https://www.baidu.com/img/bd_logo1.png'
  ,'jingdong','test name','half success');

insert into goods (project_url, complete_percent, left_time
,current_fund,fund_type,img_url,platform,project_name,status)
values ('https://www.baidu.com/',30,20,998,'success','https://www.baidu.com/img/bd_logo1.png'
,'baidu','test name','success');

insert into goods (project_url, complete_percent, left_time
,current_fund,fund_type,img_url,platform,project_name,status)
values ('https://www.baidu.com/',30,20,998,'success','https://www.baidu.com/img/bd_logo1.png'
,'baidu','test name','success');