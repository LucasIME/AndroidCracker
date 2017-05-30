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

        int keyLength = Kasiski.test(cypherText);
        System.out.println(keyLength);

        String keyEstimate = PermutationGenerator.getMostLikelyKey(cypherText, keyLength);
        System.out.println(keyEstimate);

        Brute realSolution = new Brute(keyEstimate, cypherText);
        realSolution.run();
    }
}
