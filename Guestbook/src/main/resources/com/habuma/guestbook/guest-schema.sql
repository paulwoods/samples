create table Guest (
	id identity,
	name varchar not null,
	email varchar not null,
	dateOfVisit timestamp not null
);

insert into Guest (name, email, dateOfVisit) values ('Craig', 'craig@habuma.com', current_timestamp());