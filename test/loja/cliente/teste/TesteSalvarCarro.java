package loja.cliente.teste;

import loja.cliente.ws.carro.Carro;
import loja.cliente.ws.carro.CarroWS;
import loja.cliente.ws.carro.CarroWS_Service;
import loja.cliente.ws.classificacao.Classificacao;
import loja.cliente.ws.classificacao.ClassificacaoWS;
import loja.cliente.ws.classificacao.ClassificacaoWS_Service;
import loja.cliente.ws.marca.Marca;
import loja.cliente.ws.marca.MarcaWS;
import loja.cliente.ws.marca.MarcaWS_Service;

public class TesteSalvarCarro {

    public static void main(String[] args) {
        CarroWS_Service carService = new CarroWS_Service();
        CarroWS carPort = carService.getCarroWSPort();

        MarcaWS_Service marService = new MarcaWS_Service();
        MarcaWS marPort = marService.getMarcaWSPort();

        ClassificacaoWS_Service claService = new ClassificacaoWS_Service();
        ClassificacaoWS claPort = claService.getClassificacaoWSPort();

        Carro carro = new Carro();
        Marca marca;
        Classificacao classificacao;

        // Marca Chevrolet
        marca = marPort.consultarMarca("Chevrolet");
        // Compacto        
        classificacao = claPort.consultarClassificacao("Compacto");

        carro.setModelo("ONIX");
        carro.setAno("2016/2017");
        carro.setKm("33.000");
        carro.setCor("Cinza");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("5");
        carro.setValor(300);
        carro.setObservacoes("1.0 MPFI JOY 8V FLEX 4P MANUAL 2016/2017");
        carro.setOferta(true);
        carro.setImagem("img_onix.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Sedan
        classificacao = claPort.consultarClassificacao("Sedan");

        carro.setModelo("PRISMA");
        carro.setAno("2016/2017");
        carro.setKm("16.000");
        carro.setCor("Branco");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("3");
        carro.setValor(300);
        carro.setObservacoes("1.0 MPFI JOY 8V FLEX 4P MANUAL 2016/2017");
        carro.setOferta(false);
        carro.setImagem("img_prisma.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //SUV
        classificacao = claPort.consultarClassificacao("SUV");

        carro.setModelo("TRACKER");
        carro.setAno("2017/2017");
        carro.setKm("11.000");
        carro.setCor("Prata");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Automática");
        carro.setFinalPlaca("3");
        carro.setValor(900);
        carro.setObservacoes("1.4 16V TURBO FLEX LT AUTOMÁTICO 2017/2017");
        carro.setOferta(false);
        carro.setImagem("img_tracker.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        // Marca Volkswagen
        marca = marPort.consultarMarca("Volkswagen");
        // Compacto        
        classificacao = claPort.consultarClassificacao("Compacto");

        carro.setModelo("UP!");
        carro.setAno("2015/2016");
        carro.setKm("51.000");
        carro.setCor("Prata");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("7");
        carro.setValor(290);
        carro.setObservacoes("1.0 MPI TAKE UP 12V FLEX 4P MANUAL 2015/2016");
        carro.setOferta(false);
        carro.setImagem("img_up.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Sedan
        classificacao = claPort.consultarClassificacao("Sedan");

        carro.setModelo("VOYAGE");
        carro.setAno("2014/2015");
        carro.setKm("49.000");
        carro.setCor("Branco");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("0");
        carro.setValor(380);
        carro.setObservacoes("1.6 COMFORTLINE 8V FLEX 4P MANUAL 2014/2015");
        carro.setOferta(true);
        carro.setImagem("img_voyage.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //SUV
        classificacao = claPort.consultarClassificacao("SUV");

        carro.setModelo("TIGUAN");
        carro.setAno("2014/2015");
        carro.setKm("68.000");
        carro.setCor("Branco");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina");
        carro.setCambio("Automática");
        carro.setFinalPlaca("7");
        carro.setValor(790);
        carro.setObservacoes("2.0 TSI 16V TURBO GASOLINA 4P TIPTRONIC 2014/2015");
        carro.setOferta(false);
        carro.setImagem("img_tiguan.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        // Marca Ford
        marca = marPort.consultarMarca("Ford");
        // Compacto        
        classificacao = claPort.consultarClassificacao("Compacto");

        carro.setModelo("KA");
        carro.setAno("2015/2015");
        carro.setKm("31.000");
        carro.setCor("Prata");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("0");
        carro.setValor(320);
        carro.setObservacoes("1.0 SE 12V FLEX 4P MANUAL 2015/2015");
        carro.setOferta(false);
        carro.setImagem("img_ka.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Sedan
        classificacao = claPort.consultarClassificacao("Sedan");

        carro.setModelo("KA+");
        carro.setAno("2015/2015");
        carro.setKm("65.000");
        carro.setCor("Branco");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("4");
        carro.setValor(360);
        carro.setObservacoes("1.5 SE PLUS 16V FLEX 4P MANUAL 2015/2015");
        carro.setOferta(false);
        carro.setImagem("img_kaplus.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //SUV
        classificacao = claPort.consultarClassificacao("SUV");

        carro.setModelo("ECOSPORT");
        carro.setAno("2015/2016");
        carro.setKm("39.000");
        carro.setCor("Vermelho");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("0");
        carro.setValor(490);
        carro.setObservacoes("1.6 SE 16V FLEX 4P MANUAL 2015/2016");
        carro.setOferta(true);
        carro.setImagem("img_ecosport.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        // Marca Fiat
        marca = marPort.consultarMarca("Fiat");
        // Compacto        
        classificacao = claPort.consultarClassificacao("Compacto");

        carro.setModelo("PALIO");
        carro.setAno("2014/2015");
        carro.setKm("43.000");
        carro.setCor("Branco");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("0");
        carro.setValor(260);
        carro.setObservacoes("1.0 MPI FIRE 8V FLEX 4P MANUAL 2014/2015");
        carro.setOferta(false);
        carro.setImagem("img_palio.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Compacto
        classificacao = claPort.consultarClassificacao("Compacto");

        carro.setModelo("UNO");
        carro.setAno("2015/2016");
        carro.setKm("12.000");
        carro.setCor("Branco");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("3");
        carro.setValor(270);
        carro.setObservacoes("1.0 EVO VIVACE 8V FLEX 4P MANUAL 2015/2016");
        carro.setOferta(false);
        carro.setImagem("img_uno.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Sedan
        classificacao = claPort.consultarClassificacao("Sedan");

        carro.setModelo("GRAND SIENA");
        carro.setAno("2014/2015");
        carro.setKm("38.000");
        carro.setCor("Branco");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("0");
        carro.setValor(340);
        carro.setObservacoes("1.4 MPI ATTRACTIVE 8V FLEX 4P MANUAL 2014/2015");
        carro.setOferta(true);
        carro.setImagem("img_grandsiena.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        // Marca Renault
        marca = marPort.consultarMarca("Renault");
        // Compacto        
        classificacao = claPort.consultarClassificacao("Compacto");

        carro.setModelo("SANDERO");
        carro.setAno("2016/2016");
        carro.setKm("26.000");
        carro.setCor("Prata");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("3");
        carro.setValor(310);
        carro.setObservacoes("1.0 AUTHENTIQUE 16V FLEX 4P MANUAL 2016/2016");
        carro.setOferta(true);
        carro.setImagem("img_sandero.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Sedan
        classificacao = claPort.consultarClassificacao("Sedan");

        carro.setModelo("LOGAN");
        carro.setAno("2015/2015");
        carro.setKm("41.000");
        carro.setCor("Prata");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("0");
        carro.setValor(350);
        carro.setObservacoes("1.6 EXPRESSION 8V FLEX 4P 2015/2015");
        carro.setOferta(false);
        carro.setImagem("img_logan.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //SUV
        classificacao = claPort.consultarClassificacao("SUV");

        carro.setModelo("KWID");
        carro.setAno("2017/2018");
        carro.setKm("1.000");
        carro.setCor("Laranja");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("3");
        carro.setValor(400);
        carro.setObservacoes("1.0 12V SCE FLEX INTENSE MANUAL 2017/2018");
        carro.setOferta(false);
        carro.setImagem("img_kwid.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Marca Hyundai
        marca = marPort.consultarMarca("Hyundai");
        //Compacto        
        classificacao = claPort.consultarClassificacao("Compacto");

        carro.setModelo("HB20");
        carro.setAno("2013/2013");
        carro.setKm("40.000");
        carro.setCor("Dourado");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Manual");
        carro.setFinalPlaca("6");
        carro.setValor(310);
        carro.setObservacoes("1.0 PREMIUM 16V FLEX 4P MANUAL 2013/2013");
        carro.setOferta(false);
        carro.setImagem("img_hb20.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Sedan
        classificacao = claPort.consultarClassificacao("Sedan");

        carro.setModelo("HB20S");
        carro.setAno("2013/2014");
        carro.setKm("54.000");
        carro.setCor("Dourado");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Automática");
        carro.setFinalPlaca("7");
        carro.setValor(420);
        carro.setObservacoes("1.6 COMFORT STYLE 16V 4P AUTOMÁTICO 2013/2014");
        carro.setOferta(false);
        carro.setImagem("img_hb20s.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //SUV
        classificacao = claPort.consultarClassificacao("SUV");

        carro.setModelo("TUCSON");
        carro.setAno("2014/2015");
        carro.setKm("61.000");
        carro.setCor("Prata");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina e álcool");
        carro.setCambio("Automática");
        carro.setFinalPlaca("3");
        carro.setValor(460);
        carro.setObservacoes("2.0 MPFI GLS 16V FLEX 4P AUTOMÁTICO 2014/2015");
        carro.setOferta(false);
        carro.setImagem("img_tucson.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Marca Mercedes-Benz
        marca = marPort.consultarMarca("Mercedes-Benz");
        //Luxo       
        classificacao = claPort.consultarClassificacao("Luxo");

        carro.setModelo("CLASSE C 180");
        carro.setAno("2015/2016");
        carro.setKm("25.000");
        carro.setCor("Prata");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina");
        carro.setCambio("Automática");
        carro.setFinalPlaca("0");
        carro.setValor(1200);
        carro.setObservacoes("1.6 GCI AVANTGARDE 16V TURBO GASOLINA 4P AUTOMÁTICO 2015/2016");
        carro.setOferta(true);
        carro.setImagem("img_classec180.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Marca BMW
        marca = marPort.consultarMarca("BMW");
        //Luxo
        classificacao = claPort.consultarClassificacao("Luxo");

        carro.setModelo("M140i");
        carro.setAno("2017/2017");
        carro.setKm("6.000");
        carro.setCor("Azul");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina");
        carro.setCambio("Automática");
        carro.setFinalPlaca("3");
        carro.setValor(2500);
        carro.setObservacoes("3.0 24V TURBO GASOLINA 4P AUTOMÁTICO 2017/2017");
        carro.setOferta(false);
        carro.setImagem("img_m140i.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());

        //Marca Audi
        marca = marPort.consultarMarca("Audi");
        //Luxo
        classificacao = claPort.consultarClassificacao("Luxo");

        carro.setModelo("Q3");
        carro.setAno("2014/2015");
        carro.setKm("64.000");
        carro.setCor("Cinza");
        carro.setPortas("4");
        carro.setCombustivel("Gasolina");
        carro.setCambio("Automática");
        carro.setFinalPlaca("4");
        carro.setValor(970);
        carro.setObservacoes("2.0 TFSI AMBIENTE QUATTRO 4P GASOLINA S TRONIC 2014/2015");
        carro.setOferta(false);
        carro.setImagem("img_q3.png");

        carro = carPort.salvarCarro(carro.getModelo(), carro.getAno(), carro.getKm(), carro.getCor(), carro.getPortas(),
                carro.getCombustivel(), carro.getCambio(), carro.getFinalPlaca(), Double.toString(carro.getValor()),
                carro.getObservacoes(), carro.getImagem(), Boolean.toString(carro.isOferta()),
                Long.toString(marca.getId()), Long.toString(classificacao.getId()));

        System.out.println(carro.getId());
    }
}
