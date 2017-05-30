import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String cypherText = "fencbigofiycpdxiyzygiqzonjbyyvslpikyebgbrloengvbntmckuncblczqchuutznclbv" +
                "nlmxupamidahplavcepbjmrxzwxliebgcrwzlmvpbypyrxexoeluxfmtnqcxiyjvxmapaipq" +
                "yyaxjgwcosyyxkympngvbntmckuajazcqagpnvevlzylnqdceupakbzolyipgtajqxyibzka" +
                "xioaqajurqogtfbsnverndqdcadjzxckuajakkdfypxvevfddovnojxnjbuumhugapbphgpz" +
                "mvkkiwaxlfnbuncbskoeoouaxexoelfiofyyupyyxxsnmaitajqrhyqogmszycpdrhyqogul" +
                "mycpdnymbajmcdcmvarsbbugafnlhfdfxnxpftboebgovvzxmkzjvxypqzhoeloqaneihqyy" +
                "rxagzpvyxnbkcoapxqazebgtrnzozhzlhebgtrnzozimkzdcuxexblkoiazebgczlhxtgvqv" +
                "yxffmcybkvpbrlngojqcfjjebmpopavloelhqohlggkkzmltvpbrlngojqcfjjebmpudlmyo" +
                "elhqohlggkkuiapvexndiibeynfzcvabzxexcfzaajmcdcgcjvhoelcdbilhfqyyzslpqkbl" +
                "hfqyyhlypqkbhytbkbzplewkyouadvhzppuikyrifprcyilvbezhuvbimpkkgzqcpbgxmyiy" +
                "liiqcplgakibbajmopynqleykihemxiofgqkbzayatxiourmvumxufqqrlmulxyibzkaxioa" +
                "qatugilfbezolairhybhtbevyxvevavqogzfirnqdvncbyqnqcpqcqvlnzhntbysyubrmvkk" +
                "iwanlqverndqdcadjzxibeynfzcvabzxuxzxgbavpbzllvesldknhwoosatxjmoeljmowjcg" +
                "iucidzgmavyxvevzmrpvbozpskbcxdknhzrdeuhqvlcfzmqkyhbqpvmzbkkafitnubczpmvp" +
                "bezputqyuiapvexndiibeynfzcvaosygxincyyqcdcezqokbbohuaxiobgossdbsfqkbdyga" +
                "rzobyjqpfthfxexoelvzbzjcgiucidmtcfohbqpvmzbkyipdycvpvfaxmvmoctmmfexvkkiw" +
                "anlqverndqdcadjzxibeynfzcvaosygsvhdkncvaosyolihdknymozebgqycmakcgdzyyufj" +
                "uianqlpvtxnbkncbygjbgtajqjciqognfmxuobenjcajmezlpgkkiyfcklbosyfxpzmltvpb" +
                "itajqrhyilvbezxvgcflnfnpaxiozqojyvpvpaxiozqouutphplvzlludvhzppuikywyvqyy" +
                "hylhwogtajqjciqognfmxuobenjcajmezlpgkkibfcgtfbsnwmfhoelgioosupaznrxzuwdz" +
                "yyufjuianqljvoyvtfambhvtfbsnuqyybolcbbmwcieknjobnmqcpxcvrhyqogtbndytizac" +
                "qaqzrgpnjbecbeajmjvoyvevmoxyuiinzagkvmdphpldjomgqkbzjppbezqctjrgzkaqnqcp" +
                "bgxmyiqviqszwciekokluvpbzllvexyibzkaxionqolfzlcgzqcpxcvrhylcgzqcphkdynvk" +
                "kvwadgcfbkbzipipqacioqyyyxymvbndupaxiyphybevecvtrmblvfobipmkprhyqogmszyc" +
                "pdrhyqogulmycpdnymbajmcjflveuutdlpmpddupaxiyphklizenjbnuobyujodyahlincxi" +
                "wvavynnvkbzjvxqkbnlgxkombajiqclnjizzzxufnlrwnjxkgvvmngxwzpgqyyzxyvpfiebg" +
                "lgyicptuxhphvlwbzxcgvdzyyufjuianqlzmpuvbuambhveevwyuxexzsltgidgcpdtlzxaw" +
                "zbosuvjfpzqoypfxsnjbnuobyujojfajqwimqocjrioupqcsvcagzqcpcthzhyxufmszcsyf" +
                "eazamqeivqngoycnhpplxioaqajurqocbfohuudfiydlpmpddupaxiyysgapzonjbdmvvppo" +
                "yzqlwfkzpihpljpwnkmcsvkkhqigebgtrnzozkvqcpmgxjuiasgbcjhforcndmsaqkosygxi" +
                "ncdlpmpddupakbzbcgvfirupakbzjvtvfirqgovncbmknqcouadvhzppuikyrifprcyilvbe" +
                "zputqyvmfuinlmebvevfdsppozmpuvriyvcagzeddekkuwvqanmxiowtbvjdknvpfirupasy" +
                "vpaqnqcpycokbvcagzeddekkuuiapvexndiibeynfzcvabzxoxuyoeldmxneihqyyzxyvpxa" +
                "eytezmffufikynuvqcyvcagzqcpcthzhyxufmszcsvezhbqocbzmpyrbkbpmvpbezputqyua" +
                "qltpfnvcparhydvfaxrebcqznrxziwlyrypbjcnxufolydukacyorzoihzxupfeipopoidzl" +
                "zvbiiposksbipmuxexgbavpbhsuxbuihfukwkjgytqyyafzjwcosyubruiavxmoosyhlnfjc" +
                "ajmxdcupafpzoajmzvennbrhylcgzxgwnjbvumqocvajgytbmymvjtmbkthiqycidajiqxcy" +
                "gmvncrwqvqcpycokbbbugafndiiluwmbhvmahlhkkycnldpqjvrykkkbzftcobjqaqatlzxa" +
                "glezscojrfzxufnbhlfgziyvqlfpbosyodvhzppuikyrifycynplfbezxupaxiyphklrieiv" +
                "evgwbmtcfoqonxexhrsvqmgjupaiykilpqpcebgbrloehplppmxwbznvkkjiszoiofecjkvx" +
                "moosyhfjbjcajmpzlupafpzoajmcjhfqckbzxptikyzpgovpzofnqsdyavezhbqocbjjgyve" +
                "ljjkajmbvcnjdvhzppuikyrifprcyyljwiytbcsvadslpglpppgopbzoidmxmthipvyytokk" +
                "eddorlencbmckbjqunikbzbhtbevyxgsvltahpldjomctkbv";

        cypherText = cypherText.toUpperCase();

        System.out.println(PermutationGenerator.GenerateAllPermutationsOfLength(1));
        System.out.println(PermutationGenerator.GenerateAllPermutationsOfLength(2));

        System.out.println(PermutationGenerator.GenerateAllPermutationsOfLength(3));

        int keyLength = Kasiski.test(cypherText);
        System.out.println(keyLength);
        String keyEstimate = PermutationGenerator.getMostLikelyKey(cypherText, keyLength);
        System.out.println(keyEstimate);

        String fakeKey = "XRUVXHCIXVLUC";
        Brute fakeSolution = new Brute(fakeKey, cypherText);
        fakeSolution.run();

        //ArrayList<String> allPossibleKeys = PermutationGenerator.GenerateAllPermutationsOfLength(keyLength);
        //for(String currentKey : allPossibleKeys){
        //    Brute worker = new Brute(currentKey, cypherText);
        //    worker.run();
        //}
    }
}
