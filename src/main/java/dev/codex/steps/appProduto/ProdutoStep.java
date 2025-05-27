package dev.codex.steps.appProduto;

import dev.codex.drivers.DriverFactory;

import dev.codex.helpers.ScreenshotHelper;
import dev.codex.interactions.appProduto.ProdutoInteraction;
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
    public void redirecionado_tela_produtos() {
        helper.takeScreenshot("Tela de Produto");
    }

    @Entao("Valido o nome do item")
    public void valido_nome_produto() {
        produtoInteraction.validarONomeDoItem();
    }

    @Entao("Seleciono um item")
    public void seleciono_produto() {
        produtoInteraction.selecionarUmItem();
    }

    @Entao("Valido quantidade o item no icone do carrinho")
    public void valido_quantidade_item_carrinho() {
        produtoInteraction.validarQuantidadeItemNoIconeDoCarrinho();
    }

    @Entao("Clico o icone do carrinho para redirecionar na tela do carrinho")
    public void acessar_para_tela_carrinho() {
       produtoInteraction.clickNoCarrinho();
    }
}