CRUD simples feito em Java com MySQL

Softwares usados:

Java

NetBeans

MySQL

MySQL Workbench

WampServer

=========================================================================================================

Observações:

Antes de começar o projeto execute o script loja_java.sql dentro da pasta "sql"

Importe a biblioteca JDBC do MySQL ao criar o projeto

-> Clique com o botão direito em Bibliotecas

-> Clique em Adicionar Bibliotecas

-> Selecione Driver JDBC do MySQL

-> Cliquem em Adicionar Biblioteca

~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o~~o

█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█



JForm Propriedades ~

==========================================================================================================

	*Como definir qual JForm irá rodar primeiro no NetBeans*

	-> Clique em EXECUTAR

	-> Clique em DEFINIR CONFIGURAÇÃO DO PROJETO

	-> Clique em PERSONALIZAR

	-> Clique em EXECUTAR

	-> No campo CLASSE PRINCIPAL procure pelo JFORM que deseja executar primeiro

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

Propriedades:

horizontalAlignment -> alinha o texto dentro do componente

text -> altera o texto dentro do componente

cursor -> altera a forma do cursor sobre o componente

resizable -> desmarcar esta opção faz com que a tela nao possa ser esticada em tempo de execução

font -> altera o tipo e o tamnho da fonte do texto

foreground -> altera a cor do texto

title -> Colocar um titulo no JForm

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

		Como Formatar um JTextField para datas

	-> Clique com botao direito em cima do JTextField

	-> Cliquem em Personalizar codigo

	-> Mude a opcao para Criacao Personalizada

	Coloque o seguinte codigo:

	try{

		javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("####-##-##");

		txtNascimento = new javax.swing.JFormattedTextField(data);

	} catch (Exception ex) {

			 JOptionPane.showMessageDialog(null, "Erro : " + ex.getMessage());

	}


=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

		JTable

	Configurar linhas e colunas da Tabela no NetBeans

	-> Clique com o botao direito em cima da Tabela

	-> Conteudo da Tabela


*********************************************************************************************************

	Setar os dados de uma linha da tabela nos TextBox

	-> Clique com o botao direito em cima da Tabela

	-> Clique em Eventos

	-> Clique em Mouse

	-> Clique em mouseClicked


=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

		JComboBox

	Apagar os itens gerados automaticamente pelo JComboBox

	-> Acesse as Propriedades do JComboBox

	-> Clique em Model [...]

	Definir o tipo que sera preenchido no JComboBox

	-> Na Aba propriedades clique em codigo

	-> Altere o tipo em Parametros do Tipo

	Como disparar um evento ao mudar o valor da JComboBox

	-> Clique com o botao direito em cima da JComboBox

	-> Clique em Eventos

	-> Clique em Itens

	-> Clique em itemStateChanged


********************************************************************************************************

Button Events:


Eventos -> Action -> actionPerformed : dispara um evento ao clicar no componente


Como disparar um evento enquanto algo e digitado no JTextField

-> Clique com o botao direito em cima do JTextField

-> Clique em Eventos

-> Clique em Key

-> Clique em keyReleased

********************************************************************************************************
