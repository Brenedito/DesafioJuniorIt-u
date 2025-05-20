🏦 Desafio Itaú - Vaga 99 Júnior
💻 Minha solução para o desafio técnico do Itaú (Vaga 99 - Desenvolvedor Júnior)

🔗 Desafio original: rafaellins-itau/desafio-itau-vaga-99-junior

📜 O desafio consiste em implementar uma API REST para criar e processar transações financeiras.

✅ Cadastro de transações com validação de dados

✅ Cálculo dinâmico de soma, média, mínimo, máximo e contagem

✅ Otimizado para alta performance mesmo com muitas transações


⚙️ Tecnologias:

Java 21	
Spring Boot
Lombok	
Maven



🔌 Endpoints:

POST	/transacao	Cadastra uma nova transação

GET	/estatisticas	Retorna estatísticas (últimos 60s)

DELETE	/transacao	Remove todas as transações


🧠 Diferenciais da Implementação:

✔ Eficiência: Cálculo em O(1) para estatísticas, sem percorrer toda a lista de transações

✔ Validação rigorosa: Checagem de data futura e campos obrigatórios

✔ Clean Code: Arquitetura em camadas (Controller → Service → Model)

✔ Testes unitários com JUnit e Mockito


📌 Possíveis Melhorias:

🔹 Adicionar Swagger para documentação automática

🔹 Implementar cache para otimizar consultas repetidas

🔹 Dockerizar a aplicação

