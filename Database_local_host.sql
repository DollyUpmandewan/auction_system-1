drop database auction;
create database auction;
use auction;
create table items(item_id int primary key,item_name varchar(30),seller_id int,start_bid int,category varchar(30));
create table research(original_owner varchar(30),age int,find_loc varchar(30),item_id int references items(item_id));
create table shipping(shipping_id int primary key,bidder_id int references bidder(bidder_id),bidder_address varchar(80) references bidder(bidder_address),item_id int references items(item_id));
create table seller(seller_id int primary key,email varchar(50),f_name varchar(50),l_name varchar(20),contact_no varchar(20));
create table bidder(bidder_id int primary key,f_name varchar(50),l_name varchar(50),email varchar(50),contact_no varchar(50),bidder_address varchar(80));
create table _admin(admin_id int primary key,f_name varchar(50),l_name varchar(50),email varchar(30));
create table bid_history(bid int,bid_id int primary key,bidder_id int references bidder(buider_id),item_id int references items(item_id));
create table payment(pay_id int primary key,seller_id int references seller(seller_id),f_ammount int references bidder(f_ammount),p_mode varchar(30));
create table login(fname varchar(30),lname varchar(30),username varchar(30), password varchar(30),address varchar(50),mobile varchar(10),dob date,usertype varchar(10));


insert into items values(1000,"pot",2000,5600,"artifects");
insert into items values(1001,"platinum plate",2001,500,"artifects");
insert into items values(1002,"knife",2002,900,"weapon");
insert into items values(1003,"gold chain",2003,920,"decorative");
insert into items values(1004,"hat",2004,89845,"decorative");
insert into items values(1005,"bat",2005,5000,"decorative");
insert into items values(1006,"knife",2006,50230,"weapon");
insert into items values(1007,"shaft",2007,5020,"old vehicals");
insert into items values(1008,"hollowgraphh",2008,500232,"instrument");
insert into items values(1009,"range gauge",2009,502387,"instrumnt");
insert into items values(1010,"Hollow arraw",2010,534500,"weapon");
insert into items values(1011,"ring of justice",2011,54400,"decoratives");
insert into items values(1012,"sun wish",2012,503420,"golden Artifects");
insert into items values(1013,"varing glass",2013,68200,"decorative");
insert into items values(1014,"sun wish",2014,50045,"golden Artifects");
insert into items values(1015,"Diamon of hope",2015,1000000,"Jewellaries");
insert into items values(1016,"sun wish",2014,50045,"golden Artifects");
insert into items values(1017,"sun wish",2014,50045,"golden Artifects");


insert into payment values (1,2000,5000,"netbanking");
insert into payment values(2,2001,6920,"online");
insert into payment values(3,2002,50340,"google pay");
insert into payment values(4,2003,50132,"cash");
insert into payment values(5,2004,503,"bank to bank");
insert into payment values(6,2005,50940,"cash");
insert into payment values(7,2006,5000,"netbanking");
insert into payment values(8,2007,6920,"online");
insert into payment values(9,2008,50340,"google pay");
insert into payment values(10,2009,50132,"cash");
insert into payment values(11,2010,503,"bank to bank");
insert into payment values(12,2011,50940,"cash");
insert into payment values(13,2012,5000,"netbanking");
insert into payment values(14,2013,6920,"online");
insert into payment values(15,2014,50340,"google pay");
insert into payment values(16,2015,50132,"cash");
insert into payment values(17,2016,503,"bank to bank");
insert into payment values(18,2017,50940,"cash");




insert into research values("ramesh",35,"Banglore",1000);
insert into research values("suresh",65,"Manglore",1002);
insert into research values("mahesh",25,"Gulbarga",1003);
insert into research values("kamlesh",45,"Shivmoga",1004);
insert into research values("vijesh",53,"Raichur",1005);
insert into research values("prajwal",34,"Banglore",1006);
insert into research values("akmesh",60,"Manglore",1007);
insert into research values("mahsa",23,"Gulbarga",1008);
insert into research values("dolly",25,"Shivmoga",1009);
insert into research values("Dheeraj",53,"Raichur",1010);
insert into research values("ramKishore",31,"Banglore",10011);
insert into research values("naga",34,"BANGLORE",1012);
insert into research values("Edward",21,"USA",1013);
insert into research values("Jois",45,"USA",1014);
insert into research values("Vikram",57,"SOUTH CAPE",1015);


insert into bidder values(3000,"Vinod","Kumar","vinod64@gmail.com","0786833798","Room no 211,Nandini hostel NMIT Banglore");
insert into bidder values(3001,"vijaya","devaragonda","vijasu24@gmail.com","098965353","Room no 213,Nandini hostel NMIT Banglore");
insert into bidder values(3002,"prakaski","linga","lingaprakash@gmail.com","9113540994","Room no 212,Nandini hostel NMIT Near BSF campus,Banglore");
insert into bidder values(3003,"samarth","G S","sga89@gmail.com","89563352742","Room no 001,Nandini hostel NMIT Banglore");
insert into bidder values(3004,"Ghana","shyama","shyama01@gmail.com","09987432342","Room no 214,Nandini hostel NMIT Banglore");
insert into bidder values(3005,"shreyaa","Kishan","sreyaa@gmail.com","9824749223","Room no 232,Kumaradara hostel NMIT Banglore");
insert into bidder values(3006,"pratheekasha","devaryaa","pratheeksha@gmail24@gmail.com","9088463272","Room no 013,Netharavathi hostel NMIT Banglore");
insert into bidder values(3007,"LAVAISH","linga","lingalavish@gmail.com","989343562","Room no 43,Nnadi roaa yellahanka Near old school campus,Banglore");
insert into bidder values(3008,"farnadise","claris","fernadis89@gmail.com","7842246242","Road no 21,basaveshwara nagara,Banglore");
insert into bidder values(3009,"Ghanaesas","vidahara","vidhaa01@gmail.com","09987432342","savage road ,dollers colony,Banglore 567535");
insert into bidder values(3010,"vishesh","Kumar","vishesh64@gmail.com","93484537342","mistri class,yellimalaya road,thirupathi,62356");
insert into bidder values(3011,"vijaya","devaragonda","vijasu24@gmail.com","098965353","Room no 253,vishva campus Banglore");
insert into bidder values(3012,"linges","dinesh","lingaprakash@gmail.com","9734462424","Room no 989,narrow bridge appartment,Banglore");
insert into bidder values(3013,"desas","S","desas89@gmail.com","989521242","fundil mane appartment Banglore,yellahanka banglore");
insert into bidder values(3014,"vaishnavi","Raj","vairaj@gmail.com","989862251","Mr.Colony funding colony,banglore");



insert into seller values(2000,"Saarang@gmail.com","Sarang","parag","55768235268");
insert into seller values(2001,"pratheek@gmail.com","Pratheek","kamath","55768235268");
insert into seller values(2002,"Sushruth@gmail.com","Sushruth","desai","55768235268");
insert into seller values(2003,"sundaram@gmail.com","Sunndaram","thakur","55768235268");
insert into seller values(2004,"anoop@gmail.com","Anoop","pakki","55768235268");
insert into seller values(2005,"prajwal","prajwal","singh","5576865344");
insert into seller values(2006,"Rajesh@gmail.com","","Rajesh","946593639345");
insert into seller values(2007,"64dube@gmail.com","Sushruth","dube","98393545268");
insert into seller values(2008,"ramkishore@gmail.com","ram","kishore","585738543534");
insert into seller values(2009,"Vishal@gmail.com","Vishal","mane","55768235268");
insert into seller values(2010,"shakshi@gmail.com","Shakshi","lavinton","9112345725");
insert into seller values(2011,"modi@gmail.com","Modi","narendra","55734322314");
insert into seller values(2012,"dheekashik@gmail.com","dheekshith","desith","998864332");
insert into seller values(2013,"naveen@gmail.com","naveen","mistri","911342322");
insert into seller values(2014,"kalenkesh@gmail.com","kalankesh","rajani","898383238");



insert into _admin values(5000,"Avinash","Rath","rathavi@gmail.com");
insert into _admin values(5001,"Dheemanth","M D","dheethu12@gmail.com");
insert into _admin values(5002,"Dolly","Upmandewan","dollyup2@gmail.com");
insert into _admin values(5003,"Dhanraj","Pawar","dhanaj@gmail.com");
insert into _admin values(5004,"Chethan","Chawan","Chawan.d@gmail.com");
insert into _admin values(5005,"muthuraju","V","muthurajuv_nmit@gmail.ac.in");


insert into shipping values(4000,3000,"Room no 211,Nandini hostel NMIT Banglore",1000);
insert into shipping values(4001,3001,"Room no 213,Nandini hostel NMIT Banglore",1001);
insert into shipping values(4002,3003,"Room no 001,Nandini hostel NMIT Banglore",1003);
insert into shipping values(4003,3002,"Room no 212,Nandini hostel NMIT Near BSF campus,Banglore",1004);
insert into shipping values(4004,3000,"Room no 211,Nandini hostel NMIT Banglore",1012);
insert into shipping values(4005,3004,"Room no 214,Nandini hostel NMIT Banglore",1013);
insert into shipping values(4006,3002,"Room no 212,Nandini hostel NMIT Near BSF campus,Banglore",1012);
insert into shipping values(4007,3000,"Room no 211,Nandini hostel NMIT Banglore",1007);

insert into login values("Avinash","Rath","avrath","avrath","HQTC IAF, mekhri circle","7892894831","1999-07-31","user");
insert into login values("Dolly","Upmandewan","dupman","dupman","Room no 211,Kumara Dhara hostel NMIT Banglore","9988458714","1999-10-31","admin");
insert into login values("Dheemanth","M D","dheethu","dheethu","Room no 212, Nandini hostel NMIT Bangalore","7982981384","1999-02-12","user");





