CREATE TABLE sala (
  nr_sala INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  nm_sala VARCHAR(50)  NULL  ,
  qt_metros INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(nr_sala));



CREATE TABLE software (
  id_software INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  nm_software VARCHAR(30)  NULL  ,
  ds_software VARCHAR(50)  NULL    ,
PRIMARY KEY(id_software));



CREATE TABLE equipamento (
  cd_equipamento INTEGER UNSIGNED  NOT NULL  ,
  sala_nr_sala INTEGER UNSIGNED  NOT NULL  ,
  ds_configuracao VARCHAR(50)  NULL  ,
  dt_aquisicao DATE  NULL    ,
PRIMARY KEY(cd_equipamento)  ,
INDEX equipamento_FKIndex1(sala_nr_sala),
  FOREIGN KEY(sala_nr_sala)
    REFERENCES sala(nr_sala)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE equipamento_software (
  cd_equipamento INTEGER UNSIGNED  NOT NULL  ,
  id_software INTEGER UNSIGNED  NOT NULL  ,
  dt_instalacao DATE  NULL    ,
PRIMARY KEY(cd_equipamento, id_software)  ,
INDEX equipamento_has_software_FKIndex1(cd_equipamento)  ,
INDEX equipamento_has_software_FKIndex2(id_software),
  FOREIGN KEY(cd_equipamento)
    REFERENCES equipamento(cd_equipamento)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(id_software)
    REFERENCES software(id_software)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);




