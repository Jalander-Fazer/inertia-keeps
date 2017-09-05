# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user_info (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  amount                        integer not null,
  password                      varchar(255),
  phonenumber                   varchar(255),
  due_date                      datetime(6),
  constraint pk_user_info primary key (id)
);


# --- !Downs

drop table if exists user_info;

