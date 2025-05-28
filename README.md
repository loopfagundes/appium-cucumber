
# 📱 Appium + Cucumber Automation

Automação de testes mobile utilizando **Appium** com **Cucumber**, proporcionando uma abordagem BDD (Behavior-Driven Development) para testes funcionais em dispositivos móveis.

---

## 🚀 Como Executar

### ▶️ Executando o Appium com **Inspector** habilitado

Permite utilizar a interface gráfica para inspecionar elementos do app:

```bash
appium --use-plugins=inspector --allow-cors
```

Acesse o inspector no navegador:

```
http://localhost:4723/inspector
```

---

### ▶️ Executando o Appium **sem Inspector**

Apenas inicia o servidor Appium para execução dos testes automatizados:

```bash
appium --allow-cors
```

---

## 🛠️ Pré-requisitos

- Node.js instalado
- Appium instalado globalmente
- Plugin `inspector` habilitado (caso utilize o inspector)
- Dispositivo real ou emulador configurado
- Java instalado (para executar com Cucumber, se necessário)
- Dependências do projeto instaladas

---

## 🏗️ Tecnologias Utilizadas

- ✅ Appium
- ✅ Cucumber (BDD)
- ✅ Selenium WebDriver
- ✅ Java
- ✅ JUnit 5 
- ✅ Appium Inspector (para facilitar a identificação dos elementos)

---

## 🌐 Acesso ao Inspector

Quando executado com `appium --use-plugins=inspector --allow-cors`, acesse através do navegador:

```
http://localhost:4723/inspector
```

## 📊  Screenshot Report
![](src/main/resources/img/reports/Captura%20de%20tela%20de%20report.png)