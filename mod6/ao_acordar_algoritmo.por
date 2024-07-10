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
    escreva("\nFoi até o armario e procurou por uma roupa")

    se(achouRoupa == verdadeiro){
      escreva("\nColocou a roupa do trabalho")
    } senao {
      escreva("\nContinua procurando por roupa...")
    }
  }

  funcao tomarCafe(){
    escreva("\nIndo até a cozinha...")
    escreva("\nVerifcando se tem café...")
    se(temCafePronto == falso){
      escreva("\nNão tem cafe...")
      fazerCafe()
    } senao {
      sairPraTrabalhar()
    }
  }

  funcao fazerCafe(){
    escreva("\nVerificando se tem pó de café...")
    se(temPoDeCafe == verdadeiro){
      escreva("\nPreparando café...")
      escreva("\nTomar o café")
      sairPraTrabalhar()
    } senao {
      escreva("\nNão tem pó de café...")
      sairPraTrabalhar()
    }
  }

  funcao sairPraTrabalhar(){
    escreva("\nVerificando se a porta esta trancada")
    se(portaTrancada == verdadeiro){
      escreva("\nA porta está trancada.")
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
      escreva("Não acordou")
    }
    
  }
}
