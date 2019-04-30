package com.hfad.monitorapet;

import android.provider.Telephony;

import java.util.HashMap;

public class Monitoria {
    private static HashMap<String, String> monitores = new HashMap<>();
    private static String monitor = "";

    // Primeira opção
    public static final int ATIVIDADE = 0;
    public static final int REFEICOES = 1;

    private static final String [] credItens =
            {"Atividade", "Refeições", "Upload de dados"};

    private static int credenciar = -1;

    // Atividades
    public static final int ATV_ABERTURA = 0;
    public static final int ATV_ED_ED = 1;
    public static final int ATV_MESA_1 = 2;
    public static final int ATV_MESA_2 = 3;
    public static final int ATV_APS_BANNER = 4;
    public static final int ATV_EA_EIMCLAA = 5;
    public static final int ATV_MOBILIZA = 6;
    public static final int ATV_APS_ORAL = 7;
    public static final int ATV_MINI_OFI = 8;
    public static final int ATV_BOLO = 9;
    public static final int ATV_GDT = 10;
    public static final int ATV_ASSEMBLEIA = 11;

    private static final String [] atvItens =
            {"Abertura","ED / ED", "MESA REDONDA 1", "MESA REDONDA 2", "Apresentação de Banner",
            "EA / EIMCLAA", "Mobiliza PET" , "Apresentação Oral",
            "Minicursos / Oficinas", "Tchá com Bolo", "GDT's", "Assembleia Final"};

    private static int atividade = -1;

    //Refeições
    public static final int REF_2_4_CAFE = 0;
    public static final int REF_2_4_ALMOCO = 1;
    public static final int REF_2_4_JANTAR = 2;
    public static final int REF_3_4_CAFE = 3;
    public static final int REF_3_4_ALMOCO = 4;
    public static final int REF_3_4_JANTAR = 5;
    public static final int REF_4_4_CAFE = 6;
    public static final int REF_4_4_ALMOCO = 7;
    public static final int REF_4_4_JANTAR = 8;

    private static final String [] refItens =
            {   "02/04 - Café da manhã", "02/04 - Almoço", "02/04 - Jantar",
                "03/04 - Café da manhã", "03/04 - Almoço", "03/04 - Jantar",
                "04/04 - Café da manhã", "04/04 - Almoço", "04/04 - Jantar" };

    private static int refeicao = -1;

    // Participantes
    private static HashMap<String, String> participantes = new HashMap<>();
    private static String participanteCPF;

    public static void Inicializar() {
        // Insere os dados dos monitores
        monitores.put("05543271123", "Herbert de Souza Andrade");
        monitores.put("06133325127", "Amanda Ellen Almeida da Mata");
        monitores.put("02102426203", "Kamila Junca de Souza");
        monitores.put("130745083", "Bianca Santos de Jesus");
        monitores.put("05709775177", "Carolina Cristelli Costa");
        monitores.put("42074051867", "Raul Fernandes Teodoro");
        monitores.put("01678821128", "Leticia De Almeida Rocha");
        monitores.put("05788020158", "Lucas da Silva de Jesus");
        monitores.put("03114551157", "Nemorah Mercedes Ferreira");
        monitores.put("05117292197", "Aiara Miranda Melo");
        monitores.put("02230617273", "Odaíza dos santos Alvarenga");
        monitores.put("06397291189", "Victor Gabriel Moura Ramos");
        monitores.put("02942508167", "kennedy rodrigues gomes");
        monitores.put("04483671146", "AURY HELLEN DOS PRAZERES MESQUITA");
        monitores.put("03835956140", "João Vitor da Silva");
        monitores.put("05165278352", "Jhom Leyven Lima de Oliveira");
        monitores.put("03594729150", "Isadora Luiza Fernandes");
        monitores.put("00660115158", "Christopher Alecsander Herane Rohden");
        monitores.put("07043674166", "Oerlles Leite Teles");
        monitores.put("06865172108", "Vanderlei Bellini Júnior");
        monitores.put("06171529184", "Nattaly Lúzia Nascimento Martins");
        monitores.put("03774267170", "Lucyla Silva soria");
        monitores.put("03917680181", "Yasmim Rafaelly Ferreira");
        monitores.put("44267990824", "Jennyfer Remboski Duarte");
        monitores.put("04905450179", "Nandara Maciel de Alencar");
        monitores.put("99246643100", "Eide da Silva Curado");
        monitores.put("06416936135", "lethycia do vale fernandes");
        monitores.put("06218584127", "MAKOLYN SILVA ARAUJO");
        monitores.put("05667115166", "SAMYRA KELLY SILVA DE OLIVEIRA");
        monitores.put("05788427185", "Bruna de Oliveira Cardoso");
        monitores.put("05043505109", "Camila Bicudo Mendonça");
        monitores.put("04425577108", "Júlia Francisca Marques Neves");
        monitores.put("03213272256", "Samantha Heloisa Muniz Miranda");
        monitores.put("70919608159", "Issufi Badji");
        monitores.put("62166010326", "Nils Mends Tavares");
        monitores.put("05241410104", "Leidiely Gomes Moraes");
        monitores.put("05241397175", "Anaiely Santana Moraes");
        monitores.put("61860421385", "Ivano Impami");
        monitores.put("04334269184", "Maria Cristina Arantes da Siera");
        monitores.put("03804299180", "Gleice Magalhães de Oliveira");
        monitores.put("02228144207", "Lair Tânia Fernanda de Jesus");
        monitores.put("70604996101", "Letícia Assis");
        monitores.put("70128303107", "Liandra Gomes Ferreira");
        monitores.put("01840210141", "Ana Paula de Almeida Oliveira");
        monitores.put("06068661164", "Maria Gabriela Ferreira Pereira");
        monitores.put("11166295699", "Rodrigo Alves Caldeira");
        monitores.put("09426443606", "Janeisa Soares");
        monitores.put("02197699156", "Lucas de Paula Guedes");
        monitores.put("53040511220", "João Marcelo Rezende");
        monitores.put("04225781186", "Maria Julia S Paraguassu");
        monitores.put("60684988321", "Flande Mendes");
        monitores.put("05574678101", "Daniel da Costa Viana Filho");
        monitores.put("05212122198", "Karine Rosa Ferreira Pires");
        monitores.put("06312169103", "KÁLLITHA BASTOS MOREIRA");
        monitores.put("02211596142", "Matheus Rondon Marques da Silva");
        monitores.put("01380213258", "ROMERO DOS SANTOS CALÓ");
        monitores.put("04450849108", "HEDER ARRUDA DE OLIVEIRA");
        monitores.put("06440699105", "cassio Soares Ribeiro");
        monitores.put("08422942950", "Thiago Augusto Closs");
        monitores.put("01958900192", "Carolina Souza Peixoto");
        monitores.put("04537019140", "Lucas Rodrigo Batista Leite");
        monitores.put("70724468188", "Daniel Afonso Silva");
        monitores.put("06150736113", "Rita de Kassia Ferrari Sobrinho");
        monitores.put("06548241185", "Atwah Douglas Piran Alfonso");
        monitores.put("05590781108", "Richard Rodrigues Esperidião de Sá");
        monitores.put("05537004135", "marco antonio franzin leite");
        monitores.put("06042788108", "Guilherme Henrique Alves da Silva");
        monitores.put("03882242159", "Alexandre Henryque Lopes Hardoim");
        monitores.put("05327704122","João Antonio Barros Arruda Chiavelli");
        monitores.put("01036713156", "Higor marino torres");
        monitores.put("05629081101", "Rodrigo Lima de Oliveira");

        // Insere os dados dos participantes
        participantes.put("05543271123","Herbert de Souza Andrade");
        participantes.put("75257165104","Lucas Kallil de Paula Rodrigues");
        participantes.put("88968790949","ZILIANI DA SILVA BUSS");
        participantes.put("06133325127","Amanda Ellen Almeida da Mata");
        participantes.put("04755730139","Amanda de Oliveira Santana");
        participantes.put("02102426203","Kamila Junca de Souza");
        participantes.put("130745083","Bianca Santos de Jesus");
        participantes.put("05709775177","Carolina Cristelli Costa");
        participantes.put("05253075160","Luiz Otávio Vieira");
        participantes.put("05163718193","Loren Ramos Silvério");
        participantes.put("42074051867","Raul Fernandes Teodoro");
        participantes.put("04970722110","Márcia Cristina da Silva");
        participantes.put("01678821128","Leticia De Almeida Rocha");
        participantes.put("05788020158","Lucas da Silva de Jesus");
        participantes.put("05596628158","Camila Miranda Lira");
        participantes.put("01180383117","Rayane Paula Martins Coinca");
        participantes.put("05006301198","Matheus de Brito Aguiar");
        participantes.put("70143566156","Allana Alves de Azevedo");
        participantes.put("05693318117","Matheus Vinícius Soares Lopes");
        participantes.put("70113218109","Nicollas Bernard Gomes dos Santos");
        participantes.put("03114551157","Nemorah Mercedes Ferreira");
        participantes.put("05117292197","Aiara Miranda Melo");
        participantes.put("02230617273","Odaíza dos santos Alvarenga");
        participantes.put("05911240173","Anna Clara Freitas Maia");
        participantes.put("06397291189","Victor Gabriel Moura Ramos");
        participantes.put("02942508167","kennedy rodrigues gomes");
        participantes.put("04483671146","AURY HELLEN DOS PRAZERES MESQUITA");
        participantes.put("19045980134","Rachel Nunes da Cunha");
        participantes.put("03835956140","João Vitor da Silva");
        participantes.put("72345381191","Marlos Vynicius Milán Montes");
        participantes.put("05165278352","Jhom Leyven Lima de Oliveira");
        participantes.put("06723818180","Siliane Bittencourt Pereira");
        participantes.put("05584673188","Matheus Moreira Franco");
        participantes.put("13010820666","Emilly Fátima Ferreira Lima");
        participantes.put("06404614170","Mariana Alves Peixoto da Rocha Brito");
        participantes.put("02235673295","Aline Bentes Pinto");
        participantes.put("05822545580","Louranne Rodrigues Neri");
        participantes.put("70091085101","Erika Gomes Lourenço");
        participantes.put("86940490230","JOEL DOS SANTOS LIMA");
        participantes.put("70542468107","Rafael Eugênio Tamez Lazaro");
        participantes.put("05666192108","Hellen Rodrigues Batista");
        participantes.put("04694725106","Sidney Rodrigues da Silva");
        participantes.put("03594729150","Isadora Luiza Fernandes");
        participantes.put("60503449300","Matheus da Silva Sousa");
        participantes.put("05637930155","Jussara Guedes da Rocha");
        participantes.put("05537157128","Camila Magalhães de Freitas dos Santos");
        participantes.put("00660115158","Christopher Alecsander Herane Rohden");
        participantes.put("03901608141","Izabela Carvalho Vieira");
        participantes.put("07043674166","Oerlles Leite Teles");
        participantes.put("39780748857","Anderson Aparecido Santos da Silva");
        participantes.put("05467517171","Jhenifer Fernanda Pereira Gois");
        participantes.put("03388489165","Rodrigo Bressan Poderis");
        participantes.put("07715068136","Luciana da Cruz Cortes");
        participantes.put("42345908866","Gabriel Costa Silva");
        participantes.put("10221827650","Rafael Junio Xavier");
        participantes.put("06865172108","Vanderlei Bellini Júnior");
        participantes.put("04791325184","BRUNA MENDES DE SOUSA");
        participantes.put("03417616131","MARILDA CARDOSO DOS SANTOS PIRES");
        participantes.put("04471092197","Isabella Cristina Batista Camargo");
        participantes.put("42767065800","Diego Bulhões Moraes");
        participantes.put("44416381832","Guilherme Ribeiro de Carvalho");
        participantes.put("05521592121","Amanda Monteiro de Oliveira");
        participantes.put("06171529184","Nattaly Lúzia Nascimento Martins");
        participantes.put("03774267170","Lucyla Silva soria");
        participantes.put("07295538178","Fernando Kendy Yahiro");
        participantes.put("80760414149","Renato Porfirio Ishii");
        participantes.put("70177939192","Lais Lara Silva Xavier");
        participantes.put("07340009108","Fernanda Morais Balta");
        participantes.put("95778934149","Carlos Henrique Aguena Higa");
        participantes.put("03917680181","Yasmim Rafaelly Ferreira");
        participantes.put("03924194165","edson ribeiro garcia");
        participantes.put("44267990824","Jennyfer Remboski Duarte");
        participantes.put("04905450179","Nandara Maciel de Alencar");
        participantes.put("10823477959","Rafaela Alves Tavares");
        participantes.put("99246643100","Eide da Silva Curado");
        participantes.put("06199048105","ANDERSON LUIZ RODRIGUES DE OLIVEIRA");
        participantes.put("06416936135","lethycia do vale fernandes");
        participantes.put("06717150114","Ana Flávia Batista Sousa");
        participantes.put("01775706109","Júlia Lopes Vieira");
        participantes.put("05636587112","Yasmin Gonçalves da Silva de Souza");
        participantes.put("06218584127","MAKOLYN SILVA ARAUJO");
        participantes.put("44833115816","Luana Gasparelli Feitosa");
        participantes.put("05662609136","Claudia Kauany da Silva Hildebrando");
        participantes.put("44551370843","Leticia Cuer Garcia");
        participantes.put("40570623863","Letícia Akie Nagata");
        participantes.put("07819247150","Euller Peixoto Vogarin");
        participantes.put("04998443194","Rita de Cassia Gonçalves Marques");
        participantes.put("07336281176","Bruna Darold Dresch");
        participantes.put("05657117174","alexandra da silva oliveira");
        participantes.put("48312911880","Gabrieli Vitória Stefanini dos Santos");
        participantes.put("06708443147","João Paulo Siqueira de Araujo");
        participantes.put("05052019173","Júlia Machado Borelli");
        participantes.put("15004230846","Luis Fernando Galvão");
        participantes.put("15610902711","Joab Doria Domingos");
        participantes.put("05319171188","Isabella Alvares Lima Camargo Ribeiro");
        participantes.put("05707167137","Gleidson Martins dos Santos");
        participantes.put("05210088162","Ana Clara Andrade Santos");
        participantes.put("04372776152","Natália Veloso Holanda");
        participantes.put("04429171122","Kathleen dos Santos Silva");
        participantes.put("02279553155","Marina Alves Pinheiro");
        participantes.put("70496569171","Stephani da Cruz Faria");
        participantes.put("75258374149","Juliana Barbosa Bartholomei");
        participantes.put("05667115166","SAMYRA KELLY SILVA DE OLIVEIRA");
        participantes.put("05788427185","Bruna de Oliveira Cardoso");
        participantes.put("05043505109","Camila Bicudo Mendonça");
        participantes.put("05448516173","Manoelly Meyer");
        participantes.put("42035419808","Jonathan Antonio da Silva");
        participantes.put("43184385892","lucinei firmo de souza");
        participantes.put("46315134890","Fernanda Fernandes Gonçalves");
        participantes.put("04425577108","Júlia Francisca Marques Neves");
        participantes.put("73059803749","WALBER LUIZ GAVASSONI");
        participantes.put("06797194580","Anderson Norberto Santos Cerqueira");
        participantes.put("05067691190","Luana Gomes Pereira");
        participantes.put("03520939193","Martinho José Alves de Sousa");
        participantes.put("33529515353","Sérgio Carvalho de Araújo");
        participantes.put("48094667877","Rafael Costa Ferreira");
        participantes.put("61146868375","Amanda Inara de Brito Santana");
        participantes.put("04633033182","ISABELLA MARIA POMPEU MONTEIRO PADIAL");
        participantes.put("03667310331","Tainan Pereira Azevedo");
        participantes.put("70240234146","Julia Graciela Plaza de Oliveira");
        participantes.put("03471623124","Vinicius Gabriel Barbosa Moraes");
        participantes.put("05929107173","Daniel Borges Dutra");
        participantes.put("70089192125","Mateus Tafuri de Sousa Paniago");
        participantes.put("01284986411","Vanessa Bernardo da Silva Souza");
        participantes.put("01562236199","Liz Sofia Ferreira Cardoso");
        participantes.put("03213272256","Samantha Heloisa Muniz Miranda");
        participantes.put("05203435146","Kezia Rage Curvo");
        participantes.put("70048511170","Mariane Cordeiro e Castro");
        participantes.put("06829105110","Lucas Silva de Santana");
        participantes.put("70494290153","Rafael Figueiredo de Castro");
        participantes.put("06876849198","Pedro Henrique de Assis Fukuda");
        participantes.put("44101905800","Israel Shekinah Souza Soares");
        participantes.put("08653552820","Angela Dulce Cavenaghi Altemio");
        participantes.put("44996342889","Gabriela Pereira Silva");
        participantes.put("70919608159","Issufi Badji");
        participantes.put("62166010326","Nils Mends Tavares");
        participantes.put("07374990103","Ivo Jose Basso Junior");
        participantes.put("05241410104","Leidiely Gomes Moraes");
        participantes.put("05241397175","Anaiely Santana Moraes");
        participantes.put("61860421385","Ivano Impami");
        participantes.put("04334269184","Maria Cristina Arantes da Siera");
        participantes.put("03804299180","Gleice Magalhães de Oliveira");
        participantes.put("02228144207","Lair Tânia Fernanda de Jesus");
        participantes.put("70604996101","Letícia Assis");
        participantes.put("70128303107","Liandra Gomes Ferreira");
        participantes.put("01840210141","Ana Paula de Almeida Oliveira");
        participantes.put("06068661164","Maria Gabriela Ferreira Pereira");
        participantes.put("11166295699","Rodrigo Alves Caldeira");
        participantes.put("09426443606","Janeisa Soares");
        participantes.put("02197699156","Lucas de Paula Guedes");
        participantes.put("53040511220","João Marcelo Rezende");
        participantes.put("02797888197","Geovane Alves Teodoro");
        participantes.put("03131636181","Mateus Nunes Vigilato de Freitas");
        participantes.put("04225781186","Maria Julia S Paraguassu");
        participantes.put("05799621131","Carlos Eduardo Schimerski dos Santos");
        participantes.put("04360341156","Gabriel de Azevedo Soyer");
        participantes.put("07039370140","Giulia Ribeiro Salgado");
        participantes.put("04149979138","Juliana Fernandes");
        participantes.put("04510827105","Adrielle de Souza Santos");
        participantes.put("07105742151","Wanderson Siqueira Teles");
        participantes.put("60684988321","Flande Mendes");
        participantes.put("04593547105","Sarah Helena dos Santos Farias");
        participantes.put("15368182759","Nathália Eduarda Soares Freire");
        participantes.put("33228591859","Giovana Lemos Luz Vitor");
        participantes.put("04779595126","Alessandra Rodrigues Barbosa");
        participantes.put("13893925627","Luiz Fernando Moreira Peixoto");
        participantes.put("06135696106","Tainá Maria Guimarães Kersul de Castro Carvalho");
        participantes.put("05574678101","Daniel da Costa Viana Filho");
        participantes.put("45500539841","Letícia Haunholter dos Santos");
        participantes.put("04834506185","Thalliane Raissa da Silva Xavier de Moura");
        participantes.put("05212122198","Karine Rosa Ferreira Pires");
        participantes.put("06596589170","Nayara Bento da Silva Queiroz");
        participantes.put("05417667161","WENDY KAROLINE ROSA DA SILVA");
        participantes.put("06312169103","KÁLLITHA BASTOS MOREIRA");
        participantes.put("75001497191","ANDERSON HENRIQUE SOUZA COVAS");
        participantes.put("06680329108","Alanda Ferreira Crestani");
        participantes.put("02039246908","Amailson Sandro de Barros");
        participantes.put("44008288830","Suziellen Santiago Nazzi");
        participantes.put("06450336188","Ana Carolina Maranni");
        participantes.put("00059677163","Juliano dos Santos Feliciano");
        participantes.put("06411446105","Ketlen Mota Vieira");
        participantes.put("42513907841","Arthur Pereira Lopes");
        participantes.put("05220593170","Gabrielle da Silva Pinto");
        participantes.put("05691438107","Giovanna Amorim Sandrini");
        participantes.put("45377353846","Amanda Emiliana Santos Baratelli");
        participantes.put("11669249980","Aliucha de Melo");
        participantes.put("03065115174","Dener José da Silva Nunes");
        participantes.put("02827480166","Giovana Rocha Faria");
        participantes.put("26211247800","Paulo celso de lima");
        participantes.put("02211596142","Matheus Rondon Marques da Silva");
        participantes.put("48460955842","Alessandra Alves Pereira");
        participantes.put("04116167142","Taynara Bogado Arguelho");
        participantes.put("02502255147","Davi De Sousa Alves");
        participantes.put("03531564188","Natália Reginato");
        participantes.put("47130774886","José Augusto da Costa Jacomeli");
        participantes.put("43947895836","Jéssica Soares de Souza");
        participantes.put("01380213258","ROMERO DOS SANTOS CALÓ");
        participantes.put("45304318862","Maria Eduarda Pascoaloto da Silva");
        participantes.put("48032005803","Letícia Lima Alves");
        participantes.put("45182164823","Vinicius Lopes de Aguilar");
        participantes.put("02372030140","Gabriella Aguiar Valente");
        participantes.put("06721391112","Ederson Luz Macedo");
        participantes.put("45567391870","Gerson dos Santos Farias");
        participantes.put("05394269114","Poliana Gomes Antonhassi");
        participantes.put("05792343128","Mariana Laura da Cruz da Costa");
        participantes.put("73056480191","Caio Victor Nunes");
        participantes.put("05569922105","Yasser Mathews Nadaf Canno");
        participantes.put("03214464108","Mariana Oshiro Marques");
        participantes.put("04450849108","HEDER ARRUDA DE OLIVEIRA");
        participantes.put("04519136121","Mariana Oliveira Silva");
        participantes.put("70582198186","Eveline Caldeira Vasconcellos");
        participantes.put("04122276144","Danilo Gomes Silva");
        participantes.put("44619572845","Bruna Raíssa Santos Sampaio");
        participantes.put("10342891871","Rosemeire Aparecida de Almeida");
        participantes.put("46584878880","Roberto Junior Dias");
        participantes.put("31136027858","Mariana Peres de Lima Chaves e Carvalho");
        participantes.put("88701115200","Priscila Brelaz da Silva");
        participantes.put("05187331140","Luis Felipe Magalhães de Menezes");
        participantes.put("06440699105","cassio Soares Ribeiro");
        participantes.put("03730961195","Ellen Elizabeth da Silva Dantas");
        participantes.put("02307191127","Mylla Cristie da Silva Mendes");
        participantes.put("08422942950","Thiago Augusto Closs");
        participantes.put("03590126124","Jeniffer de Oliveira dos Reis");
        participantes.put("01958900192","Carolina Souza Peixoto");
        participantes.put("81632681900","Waleria Christiane Rezende Fett");
        participantes.put("45864968862","Natalia RODRIGUES DA SILVA");
        participantes.put("04537019140","Lucas Rodrigo Batista Leite");
        participantes.put("70724468188","Daniel Afonso Silva");
        participantes.put("05477922125","dylan figueiredo orton");
        participantes.put("06150736113","Rita de Kassia Ferrari Sobrinho");
        participantes.put("05052008139","Lucas Machado Vieira");
        participantes.put("06548241185","Atwah Douglas Piran Alfonso");
        participantes.put("48498763827","Felippe Calsavara Gonçalves");
        participantes.put("16072719740","Stephany Raianny Do Carmo Machado Fernandes");
        participantes.put("02364267102","Lucas Modesto de Souza");
        participantes.put("05264163197","Andressa Silva Hoffmann");
        participantes.put("05590781108","Richard Rodrigues Esperidião de Sá");
        participantes.put("04357312116","Renato Camy de Araújo Bittencourt");
        participantes.put("05537004135","marco antonio franzin leite");
        participantes.put("06042788108","Guilherme Henrique Alves da Silva");
        participantes.put("03882242159","Alexandre Henryque Lopes Hardoim");
        participantes.put("05327704122","João Antonio Barros Arruda Chiavelli");
        participantes.put("01036713156","Higor marino torres");
        participantes.put("13761319860","Eugenia Brunilda Opazo Uribe");
        participantes.put("05269491125","Érica Silva de Alencar");
        participantes.put("44226422864","Guilherme Cioccia Neves");
        participantes.put("05629081101","Rodrigo Lima de Oliveira");
        participantes.put("03679254601","Adriana Régia Marques de Souza");


    }

    public static boolean validarMonitor(String cpf) {
        return monitores.containsKey(cpf);
    }

    public static void setCredenciar(int credenciar) {
        Monitoria.credenciar = credenciar;
    }

    public static int getCredenciar() {
        return Monitoria.credenciar;
    }

    public static String[] getCredItens() {
        return Monitoria.credItens;
    }

    public static void setAtividade(int atividade) {
        Monitoria.atividade = atividade;
        Monitoria.refeicao = -1;
    }

    public static int getAtividade() {
        return Monitoria.atividade;
    }

    public static String[] getAtvItens() {
        return Monitoria.atvItens;
    }

    public static void setRefeicoes(int refeicao) {
        Monitoria.refeicao = refeicao;
        Monitoria.atividade = -1;
    }

    public static int getRefeicoes() {
        return Monitoria.refeicao;
    }

    public static String[] getRefItens() {
        return Monitoria.refItens;
    }

    public static void setParticipanteCPF(String cpf){
        participanteCPF = cpf;
    }

    public static String getParticipanteCPF() {
        return participanteCPF;
    }

    public static String getParticipanteNome() {
        return Monitoria.participantes.get(Monitoria.participanteCPF);
    }

    public static boolean validarParticipante() {
        return participantes.containsKey(participanteCPF);
    }

    public static void setMonitor(String cpf) {
        Monitoria.monitor = cpf;
    }

    public static String getMonitor() {
        return Monitoria.monitor;
    }
}
