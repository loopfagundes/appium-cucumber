package dev.codex.steps.produto;

import dev.codex.drivers.DriverFactory;

import dev.codex.helpers.ScreenshotHelper;
import dev.codex.interactions.produto.ProdutoInteraction;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.pt.Entao;

public class ProdutoStep {

    private final ProdutoInteraction produtoInteraction;
    private final ScreenshotHelper helper;

    public ProdutoStep() {
        AppiumDriver driver = DriverFactory.getDriver();
        produtoInteraction = new ProdutoInteraction(driver);
        helper = new ScreenshotHelper(driver);
    }

    @Entao("Sou redirecionado para tela dos produtos")
    public void redirecionadoTelaProdutos() {
        helper.takeScreenshot("Tela de Produto");
    }

    @Entao("Valido o nome do item")
    public void validoNomeProduto() {
        produtoInteraction.validarONomeDoItem();
    }

    @Entao("Seleciono um item")
    public void selecionoProduto() {
        produtoInteraction.selecionarUmItem();
    }

    @Entao("Valido quantidade o item no icone do carrinho")
    public void validoQuantidadeItemCarrinho() {
        produtoInteraction.validarQuantidadeItemNoIconeDoCarrinho();
    }

    @Entao("Clico o icone do carrinho para redirecionar na tela do carrinho")
    public void acessarParaTelaCarrinho() {
       produtoInteraction.clickNoCarrinho();
    }
}