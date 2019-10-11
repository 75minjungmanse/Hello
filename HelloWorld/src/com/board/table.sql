select * from tab;

create table boards(board_no number not null, title varchar2(100) not null,
                    content varchar2(300) not null, writer varchar2(10) not null,
                    creation_date date, orign_no number);
                    
alter table boards add constraint board_pk primary key(board_no);

alter table user_login add constraint user_pk primary key(id);