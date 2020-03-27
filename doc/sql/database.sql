DROP TABLE IF EXISTS userinfo;

CREATE TABLE IF NOT EXISTS userinfo (
  userid int(11) NOT NULL,
  username varchar(255)  DEFAULT NULL,
  password varchar(255)  DEFAULT NULL,
  message varchar(255)  DEFAULT NULL,
  PRIMARY KEY (userid)
) ;



DROP TABLE IF EXISTS leave_message;

CREATE TABLE IF NOT EXISTS leave_message (
  leaveId int(11) NOT NULL,
  userId int(11) NOT NULL,
  message varchar(255)  DEFAULT NULL,
  leaveStatus int(2)  DEFAULT NULL,
  PRIMARY KEY (userId)
) ;