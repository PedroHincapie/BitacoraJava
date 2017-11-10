/*Task description
 * 
 * Calculate the number of different event types registered by each sensor
 * 
Given a table events with the following structure:
 create table events (
 sensor_id integer not null,
 event_type integer not null,
 value float not null,
 time timestamp not null
 );
write an SQL query that returns a set of all sensors (sensor_id) with the
number of different event types (event_type) registered by each of them,
ordered by sensor_id (in ascending order).
*/




create database codility;

use codility;

 create table events (
 sensor_id integer not null,
 event_type integer not null,
 value float not null,
 time timestamp not null
 );

insert into events value(2,2,3,now());
 
insert into events value(2,4,3,now());
  
insert into events value(2,2,3,now());
   
insert into events value(2,3,3,now());
	
insert into events value(3,2,3,now());
	
select ev.sensor_id, count(distinct(ev.event_type)) from events as ev GROUP BY sensor_id;