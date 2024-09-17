## Histórias de Usuário

### 1. Cadastrar
- **Como** usuário,
- **Eu quero** me cadastrar no sistema,
- **Para que** eu possa criar um perfil com meus dados pessoais e ter acesso às funcionalidades do sistema de aluguel de carros.
  
**Critérios de Aceitação:**
- O sistema deve validar se o CPF já está registrado e impedir duplicidade.
- O cadastro só será concluído se todos os dados obrigatórios forem preenchidos corretamente.
Após o cadastro, o usuário deve receber um e-mail de confirmação.

**Regras de Negócio:**
- RN 1: Cada CPF deve ser único no sistema.
- RN 2: O sistema deve armazenar e proteger os dados pessoais de acordo com a LGPD.
- RN 3: Usuários não cadastrados não podem acessar as funcionalidades de pedidos de aluguel.


### 2. Gerir Pedidos 
- **Como** cliente,
- **Eu quero** poder criar, modificar, consultar e cancelar meus pedidos de aluguel,
- **Para que** eu tenha controle total sobre meus contratos de aluguel de automóveis.

  **Critérios de Aceitação:**
- O cliente deve poder selecionar o tipo de contrato (12, 24, 36 ou 48 meses).
- O sistema deve permitir ao cliente modificar ou cancelar pedidos enquanto eles estiverem no status “pendente” ou “em avaliação”.
- O cliente deve poder visualizar o histórico de todos os seus pedidos de aluguel.
- O sistema deve garantir que os pedidos cancelados não sejam processados.

**Regras de Negócio:**
- RN 1: O cliente só pode modificar pedidos que não tenham sido aprovados.
- RN 2: Pedidos cancelados devem ser marcados como “cancelados” e não podem ser reativados.
- RN 3: O cliente deve ter até três rendimentos diferentes registrados para um pedido.

### 3. Modificar Pedidos
- **Como** agente,
- **Eu quero** poder modificar os pedidos de aluguel feitos pelos clientes,
- **Para que** eu possa ajustar as condições de acordo com a análise financeira ou outros requisitos específicos.

**Critérios de Aceitação:**
- O agente deve poder visualizar e modificar os pedidos de aluguel com base nos critérios financeiros ou operacionais.
- O sistema deve notificar o cliente sobre qualquer alteração feita pelo agente em seu pedido.
- As alterações feitas pelo agente devem ser registradas no histórico do pedido e visíveis para o cliente.
**Regras de Negócio:**
- RN 1: O agente só pode modificar pedidos no status “em avaliação” ou “pendente”.
- RN 2: O cliente deve ser notificado automaticamente sobre alterações feitas no pedido.

### 4. Avaliar Pedidos
- **Como** agente,
- **Eu quero** poder avaliar os pedidos de aluguel,
- **Para que** eu possa determinar se eles atendem aos critérios financeiros e operacionais antes de aprovar ou rejeitar o contrato.

**Critérios de Aceitação:**
- O agente deve ter acesso a todas as informações financeiras e do contrato para análise.
- O agente deve poder aprovar ou rejeitar um pedido com base na análise financeira.
- O sistema deve informar ao cliente sobre a aprovação ou rejeição do pedido.
**Regras de Negócio:**
- RN 1: O sistema deve garantir que o agente tenha acesso às informações financeiras do cliente para a avaliação.
- RN 2: O pedido só pode ser aprovado se o cliente atender aos critérios financeiros (ex.: rendimentos cobrirem pelo menos 30% do valor total do contrato).
- RN 3: O cliente deve ser notificado automaticamente após a avaliação, seja positiva ou negativa.

### 5. Analisar de Crédito
- **Como** agente,
- **Eu quero** realizar a análise de crédito dos clientes,
- **Para que** eu possa determinar se eles são elegíveis para obter o contrato de crédito associado ao aluguel do automóvel.

**Critérios de Aceitação:**
- O agente deve ter acesso aos dados financeiros do cliente (empregadores e rendimentos) e ao histórico de crédito.
- O sistema deve calcular automaticamente a elegibilidade do cliente para um contrato de crédito.
- O agente deve poder aprovar ou rejeitar a solicitação de crédito.
  
**Regras de Negócio:**
- RN 1: O cliente só é elegível para crédito se seus rendimentos e histórico de crédito atenderem aos critérios mínimos estabelecidos pelo agente.
- RN 2: A análise de crédito deve ser realizada antes da assinatura do contrato de aluguel.
- RN 3: A aprovação do crédito deve ser vinculada à duração do contrato (mínimo de 12 meses).

### 6. Conceder Crédito
- **Como** agente,
- **Eu quero** poder conceder crédito aos clientes aprovados,
- **Para que** o contrato de aluguel de automóveis possa ser formalizado com um financiamento vinculado.

**Critérios de Aceitação:**
- O agente deve poder formalizar o contrato de crédito após a aprovação da análise.
- O sistema deve associar o contrato de crédito ao contrato de aluguel do automóvel.
- O cliente deve ser informado sobre a aprovação e os detalhes do contrato de crédito.

**Regras de Negócio:**
- RN 1: O contrato de crédito só pode ser concedido após aprovação financeira do cliente.
- RN 2: O contrato de crédito deve estar vinculado a um veículo e a um contrato de aluguel com duração mínima de 12 meses.
- RN 3: O sistema deve emitir automaticamente os documentos de contrato para o cliente após a concessão do crédito.
