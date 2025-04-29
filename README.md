🧠 Foco na Modelagem de Classes
Este projeto foi desenvolvido com ênfase na construção da camada model, responsável por representar as principais entidades e componentes de hardware oferecidos pela loja.

As classes foram desenhadas com base em princípios de orientação a objetos, visando modularidade, reutilização de código e representação fiel dos elementos de um computador.

📦 Entidades Modeladas:
Componente: classe base genérica com atributos comuns entre os componentes de hardware.

Computador: representa um computador montado, agregando os componentes necessários.

Cpu, Fonte, PlacaMae, Ram, Socket, TipoMemoria: subclasses de Componente que modelam diferentes peças de hardware, com atributos específicos.

Essa estrutura facilita:

A expansão futura do sistema (ex: novos tipos de componentes).

A manutenção do código, separando responsabilidades.

A possibilidade de integração com banco de dados ou APIs REST no futuro.
