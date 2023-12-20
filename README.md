# universidade

Curso:
    CodCurso,
    NomeCurso (List com
        Administração de Empresas,
        Bio Medicina,
        Ciências Biológicas,
        Ciencias da Computação,
        Direito, Educação Física,
        Farmacologia,
        Rede de Computadores,
        Sistemas de Informações
    ),
    TipoCurso (RadioButton com
        Bacharel,
        Gestão,
        outros
    ),
    CargaHorária,
    CodInstituto;

Disciplina:
    CodDisc,
    NomeDisc,
    CargaHorária,
    AulasSemana (RadioButton com
        1,
        2,
        3,
        4,
        5,
        6
    );

Aluno:
    Matricula,
    Nome,
    DataNasc,
    CodCurso,
    NomeCurso,
    (List com
        CodDisciplina,
        NomeDisciplina
    ),
    Nota NP1,
    Nota NP2,
    Média,
    Faltas;

Professor:
    IdentProf,
    NomeProf,
    rua/av,
    numero,
    bairro,
    cidade,
    estado,
    telfixo,
    celular,
    DataNasc,
    EspecProf (CheckBox com
        Dierito,
        Informática,
        Matemática,
        Medicina
        ),
    TituloProf (CheckBox com
        Bacharel,
        Especialista Lato Sensu,
        Mestrado,
        Doutorado
    );

create database faculdade;

use faculdade;

CREATE TABLE curso (
    CodCurso int(11) NOT NULL,
    NomeCurso varchar(45) NOT NULL,
    TipoCurso varchar(45) NOT NULL,
    CargaHoraria varchar(45) NOT NULL,
    CodInstituto varchar(45) NOT NULL,
    PRIMARY KEY (CodCurso)
);

CREATE TABLE disciplina (
    CodDisc int(11) NOT NULL,
    NomeDisc varchar(45) NOT NULL,
    CargaHoraria varchar(45) NOT NULL,
    AulasSemana varchar(45) NOT NULL,
    PRIMARY KEY (CodDisc)
);

CREATE TABLE aluno (
    Matricula int(11) NOT NULL,
    Nome varchar(45) NOT NULL,
    DataNasc varchar(45) NOT NULL,
    CodCurso varchar(45) NOT NULL,
    NomeCurso varchar(45) NOT NULL,
    CodDisc varchar(45) NOT NULL,
    NomeDisc varchar(45) NOT NULL,
    NP1 varchar(45) NOT NULL,
    NP2 varchar(45) NOT NULL,
    Media varchar(45) NOT NULL,
    Faltas varchar(45) NOT NULL,
    PRIMARY KEY (Matricula)
);

CREATE TABLE professor (
    IdentProf int(11) NOT NULL,
    NomeProf varchar(45) NOT NULL,
    Rua varchar(45) NOT NULL,
    Numero varchar(45) NOT NULL,
    Bairro varchar(45) NOT NULL,
    Cidade varchar(45) NOT NULL,
    Estado varchar(45) NOT NULL,
    TelFixo varchar(45) NOT NULL,
    Celular varchar(45) NOT NULL,
    DataNasc varchar(45) NOT NULL,
    EspecProf varchar(45) NOT NULL,
    TituloProf varchar(45) NOT NULL,
    PRIMARY KEY (IdentProf)
);

drop database faculdade;
