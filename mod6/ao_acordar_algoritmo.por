programa {
  logico despertador = verdadeiro
  logico achouRoupa = verdadeiro
  logico temCafePronto = falso
  logico temPoDeCafe = verdadeiro
  logico portaTrancada = verdadeiro

  funcao usarBanheiro(){
    escreva("\nUsou o banheiro, escovou os dentes e tomou banho...")
  }

  funcao seTrocar(){
    escreva("\nFoi at� o armario e procurou por uma roupa")

    se(achouRoupa == verdadeiro){
      escreva("\nColocou a roupa do trabalho")
    } senao {
      escreva("\nContinua procurando por roupa...")
    }
  }

  funcao tomarCafe(){
    escreva("\nIndo at� a cozinha...")
    escreva("\nVerifcando se tem caf�...")
    se(temCafePronto == falso){
      escreva("\nN�o tem cafe...")
      fazerCafe()
    } senao {
      sairPraTrabalhar()
    }
  }

  funcao fazerCafe(){
    escreva("\nVerificando se tem p� de caf�...")
    se(temPoDeCafe == verdadeiro){
      escreva("\nPreparando caf�...")
      escreva("\nTomar o caf�")
      sairPraTrabalhar()
    } senao {
      escreva("\nN�o tem p� de caf�...")
      sairPraTrabalhar()
    }
  }

  funcao sairPraTrabalhar(){
    escreva("\nVerificando se a porta esta trancada")
    se(portaTrancada == verdadeiro){
      escreva("\nA porta est� trancada.")
      escreva("\nPegou a chave e colocou na fechadura")
      escreva("\nSaiu e trancou a porta...")
    } senao {
      escreva("\nSaiu e trancou a porta...")
    }
  }

  funcao inicio() {

    se(despertador == verdadeiro){
      escreva("Acordou e desligou o despertador")
      usarBanheiro()
      seTrocar()
      tomarCafe()
    } senao {
      escreva("N�o acordou")
    }
    
  }
}
