--
--    Copyright 2015-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

drop table if exists city;
drop table if exists hotel;

create table city (id int primary key auto_increment, name varchar(128), state varchar(128), country varchar(128));
create table hotel (city int, name varchar(128), address varchar(128), zip varchar(128));

insert into city (name, state, country) values
('San Francisco', 'CA', 'US'),
('Tokyo', 'TKO', 'JP');
insert into hotel(city, name, address, zip) values
(1, 'Conrad Treasury Place', 'William & George Streets', '4001'),
(2, 'arakawa', 'arakawa 4-3', '1160014');
