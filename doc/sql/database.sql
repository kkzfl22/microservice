DROP TABLE IF EXISTS userinfo;

CREATE TABLE userinfo (
  userid int(11) NOT NULL,
  username varchar(255)  DEFAULT NULL,
  password varchar(255)  DEFAULT NULL,
  message varchar(255)  DEFAULT NULL,
  PRIMARY KEY (userid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



DROP TABLE IF EXISTS leave_message;

CREATE TABLE leave_message (
  userId int(11) NOT NULL,
  message varchar(255)  DEFAULT NULL,
  leaveStatus int(2)  DEFAULT NULL,
  PRIMARY KEY (userId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;