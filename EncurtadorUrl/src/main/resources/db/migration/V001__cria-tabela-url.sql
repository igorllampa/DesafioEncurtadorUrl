create table url(
	id bigint not null auto_increment,
	id_usuario varchar(50) not null,
	url_original varchar(200),
	url_encurtada varchar(200),
	data_criacao datetime,
	status_clicks bigint,
	primary key (id)
);