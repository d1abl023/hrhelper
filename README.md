<div>
<H1> About: </H1>
    Human Resource Helper is a web application that was created to help companies HR in searching information about 
  employee. HR can write <b>mentions</b> about people that have worked or still working in companies. After that this
  mention is visible to all other HR managers or directors and other stuff is not able to see mentions about them. 
  So, using this application, HR managers from different companies can share or read mentions about employees. 

<H3> To create database please use: </H3>
CREATE DATABASE hrhelper;<br>
CREATE TABLE user_general_data(id BIGSERIAL NOT NULL, date_of_birth date, sex text, phone_number bigint, email text, country text, city text, education text, place_of_work text, position text, amount_of_mentions integer, PRIMARY KEY(id));<br>
CREATE TABLE user_name_data(id bigint, first_name text, second_name text, last_name text, PRIMARY KEY(id));<br>
CREATE TABLE auth_data(id bigint, login text, password text, phone_number bigint, email text,PRIMARY KEY(id));<br>
CREATE TABLE dialogs(id SERIAL NOT NULL, user1 bigint, user2 bigint, user1Login text, user2Login text, PRIMARY KEY(id));<br>
CREATE TABLE messages(id SERIAL NOT NULL, dialogId bigint, sender text, msg text, receiver text, timestamp bigint, PRIMARY KEY(id));<br>
CREATE TABLE mentions(id BIGSERIAL NOT NULL, mentions text, PRIMARY KEY(id));<br>
CREATE TABLE settings(id bigint, settings text, PRIMARY KEY (id));<br>
CREATE TABLE user_additional_data(id bigint, homecountry text, hometown text, school_list text, PRIMARY KEY(id));<br>
CREATE TABLE user_mentions_id(id bigint, mentions_id_list text, PRIMARY KEY (id));<br>
</div>