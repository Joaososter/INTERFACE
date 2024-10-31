Sistema de Gestão de Funcionários em java 

Este projeto consiste em um sistema simples de gestão de funcionários, focado no cálculo de bônus anual com base no tipo de funcionário. Para garantir flexibilidade, o sistema utiliza uma interface chamada Funcionario, que define o método calcularBonus(). Duas classes concretas implementam essa interface: FuncionarioAssalariado, onde o bônus é um valor fixo de R$ 5.000,00, e FuncionarioHorista, que calcula o bônus como 10% do total recebido anualmente pelo funcionário. Na classe principal (Main), são criadas instâncias desses dois tipos de funcionários, e o valor do bônus de cada um é exibido ao chamar o método calcularBonus(). Esse projeto é ideal para entender conceitos de interface, polimorfismo e encapsulamento em Java.



🚀 Começando


Tema: Sistema de Gestão de Funcionários

Imagine que você está desenvolvendo um sistema de gestão para uma empresa. Esse sistema precisa lidar com diferentes tipos de funcionários, cada um com uma forma distinta de cálculo de bônus. Queremos garantir que todos os tipos de funcionários tenham uma forma de calcular seu bônus anual, mas o cálculo varia de acordo com a categoria do funcionário.

Enunciado:

Crie uma interface chamada Funcionario que defina um método calcularBonus(). Em seguida, crie duas classes que implementem essa interface:

FuncionarioAssalariado: o bônus é um valor fixo de R$ 5.000,00.

FuncionarioHorista: o bônus é calculado como 10% do total anual recebido pelo funcionário.

Após criar as classes, implemente uma classe principal (Main) que crie instâncias dos dois tipos de funcionários e invoque o método calcularBonus() para mostrar o valor do bônus de cada funcionário.



📋 Pré-requisitos


Java JDK (versão 11 ou superior)

Visual Studio Code para desenvolvimento e execução do código.


🔧 Instalação

Faça o download ou clone o repositório do projeto para seu ambiente local: git clone https://github.com/Joaososter/INTERFACE.git

Abra o projeto no VS code

Compile e execute no terminal ou através da extensão de Java no VS Code.


🛠️ Construído com:

Java - Linguagem de programação usada

Visual Studio Code - IDE utilizada para o desenvolvimento


📌 Versão

* Versão 1.0 Implementacao inicial
* Versão 1.1 - Atualizacao do readme 



✒️ Autores
João Soster - Trabalho Inicial - Programacao orientada a objetos
