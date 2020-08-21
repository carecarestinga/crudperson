CREATE TABLE PESSOAENTITY(
    ID      LONG       NOT NULL,
    NOME    	VARCHAR(100)      NOT NULL,
    APELIDO    	VARCHAR(40)      NOT NULL,
    CPFOUCNPJ      VARCHAR(11)    NOT NULL,
    PROFISSAO    	VARCHAR(40)      NOT NULL,
    SALARIO      DECIMAL         NOT NULL,
    DATA_NASCIMENTO		TIMESTAMP,
    PRIMARY KEY(ID)
);


CREATE SEQUENCE sequence_pessoa
	START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    NO CYCLE
    NO CACHE
;

insert into PESSOAENTITY values (sequence_pessoa.NEXTVAL, 'Fernando Cardoso', 'Fernandinho', '12354469875', 'Desenvolvedor java', 4000, '2018-12-28 02:00:21');
insert into PESSOAENTITY values (sequence_pessoa.NEXTVAL, 'Gustavo Santos','Fernandinho', '12354469875', 'Desenvolvedor java', 4000, '2018-12-28 02:00:21');
insert into PESSOAENTITY values (sequence_pessoa.NEXTVAL, 'João da Silva', 'Fernandinho', '12354469875', 'Desenvolvedor java', 4000, '2018-12-28 02:00:21');
insert into PESSOAENTITY values (sequence_pessoa.NEXTVAL, 'Guilherme Bezerra','Fernandinho', '12354469875', 'Desenvolvedor java', 4000, '2018-12-28 02:00:21');
insert into PESSOAENTITY values (sequence_pessoa.NEXTVAL, 'Antonio Silveira', 'Fernandinho', '12354469875', 'Desenvolvedor java', 4000, '2018-12-28 02:00:21');
