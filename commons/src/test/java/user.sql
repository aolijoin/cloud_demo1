create table user
(
    id       int auto_increment
        primary key,
    username varchar(50) null,
    password varchar(50) null
);

INSERT INTO student.user (name, username, password, sex, create_time, update_time, create_user, update_user) VALUES ('用户123', '123', '123', 1, '2023-10-13 08:05:56', '2023-07-13 08:59:50', 2, 2);
INSERT INTO student.user (name, username, password, sex, create_time, update_time, create_user, update_user) VALUES ('用户admin', 'admin', '123', 1, '2023-07-13 08:59:50', '2023-10-08 08:59:40', 2, 2);
INSERT INTO student.user (name, username, password, sex, create_time, update_time, create_user, update_user) VALUES ('李四', 'lisi', '123', 0, '2023-10-08 08:59:40', '2023-07-15 05:59:27', 2, 2);
INSERT INTO student.user (name, username, password, sex, create_time, update_time, create_user, update_user) VALUES ('王五', 'wangwu', '123', 0, '2023-07-15 05:59:27', '2023-10-13 08:05:56', 2, 2);
create table teacher
(
    id   int auto_increment
        primary key,
    name varchar(50) null
);

INSERT INTO student.teacher (name) VALUES ('张三');
INSERT INTO student.teacher (name) VALUES ('李四');

create table student
(
    id        int auto_increment
        primary key,
    atn       varchar(20) null comment 'Admission ticket number 准考证号',
    name      varchar(25) null comment '年龄',
    sex       char(3)     null comment '性别',
    person_id char(20)    null comment '身份证'
);

INSERT INTO student.student (atn, name, sex, person_id) VALUES ('编号', '名字', '性别', '身份证');
