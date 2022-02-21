fun main (){
    val calcF = calcFisica()

    println("Digite o numero da Massa:")
    val m:Float = readLine()!!.toFloat()
    println("Digite a aceleração da gravidade:")
    val g:Float = readLine()!!.toFloat()
    println("Digite o valor de velocidade:")
    val v:Float = readLine()!!.toFloat()
    println("Digite o valor do raio de curva:")
    val r:Float = readLine()!!.toFloat()
    println("Digite o valor de Força:")
    val f:Float = readLine()!!.toFloat()
    println("Digite o valor de variação de tempo:")
    val at:Float = readLine()!!.toFloat()
    println("Digite o valor de constante elastica:")
    val k:Float = readLine()!!.toFloat()
    println("Digite o valor de deformação:")
    val x:Float = readLine()!!.toFloat()
    println("Digite o valor de deslocamento:")
    val a:Float = readLine()!!.toFloat()
    println("Digite o valor de velocidade inicial:")
    val vo:Float = readLine()!!.toFloat()



    val forcapeso = calcF.forcapeso(m, g)
    val fcentripta = calcF.fcentripta(m,v, r )
    val impulso = calcF.impulso(f, at)
    val forcaelastica = calcF.forcaelastica(k,x)
    val velocidademedia = calcF.velocidademedia(a,at)
    val mru = calcF.mru(a,at)
    val mruv = calcF.mru(a,at)

    println("O resultado da forcapeso é $forcapeso")
    println("O resultado da fcentripta é $fcentripta")
    println("O resultado do impulso é $impulso")
    println("O resultado da forcaelastica é $forcaelastica")
    println("O resultado da velocidademedia é $velocidademedia")
    println("O resultado de mru é $mru")
    println("O resultado de mruv é $mruv")

}