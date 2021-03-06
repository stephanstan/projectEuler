/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stephanstan.euler;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @Disabled
    @Test
    void EulerQuestion1() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(sum);
            }
        }
    }

    /**
     Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
     1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

     63,245,986
     */
    @Disabled
    @Test
    void EulerQuestion2()
    {
        int n1=0,n2=1,n3,i,
                count=34;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        } // end of for loop
        System.out.println("");
    } // end of test method

    /**
     Largest prime factor
     Problem 3
     The prime factors of 13195 are 5, 7, 13 and 29.
     What is the largest prime factor of the number 600851475143

     600,851,475,143
     largest integer is    2,147,483,647

     https://stackoverflow.com/questions/16546038/a-long-bigger-than-long-max-value?lq=1

     What is the maximum value of long in Java?
     long: The long data type is a 64-bit signed two's complement integer.
     It has a minimum value of -9,223,372,036,854,775,808
     and a maximum value of 9,223,372,036,854,775,807 (inclusive).
     Use this data type when you need a range of values wider than those provided by int
     71 is a prime factor

     */
    @Disabled
    @Test
    void largestPrimeFactor() {
        int i;
        int count = 100;
        Long target = Long.valueOf("600851475143");
        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            System.out.println(i + " xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx: " + target % i);
        }

    }

    @Disabled
    @Test
    void largestPrimeFactor71Factoredout() {
        int i;
        int count = 10000;
        Long target = Long.valueOf("8462696833");
        for (i = 199; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            System.out.println(i + " yyyyyyyyyyyyyyyyyyyyyyyyyyy: " + target % i);
        }

    }

    /**   System.out.println(600851475143 % 5);
     System.out.println(600851475143 % 7);
     System.out.println(600851475143 % 11);
     */

    /**
     * 71 839 1471 6857
     * 8,462,696,833
     */
    /**
     * http://mathworld.wolfram.com/PalindromicNumber.html
     *
     * \t([0-9])([0-9])([0-9])([0-9])([0-9])
     * \t\1\2\3\4\5\t\5\4\3\2\1
     *
     * 101 x 101 = 	10201	10201		TRUE
     * 101 x 111 = 	11211	11211		TRUE
     * 101 x 121 = 	12221	12221		TRUE
     * 101 x 131 = 	13231	13231		TRUE
     * 101 x 141 = 	14241	14241		TRUE
     * 101 x 151 = 	15251	15251		TRUE
     * 101 x 161 = 	16261	16261		TRUE
     * 101 x 171 = 	17271	17271		TRUE
     * 101 x 181 = 	18281	18281		TRUE
     * 101 x 191 = 	19291	19291		TRUE
     * 101 x 202 = 	20402	20402		TRUE
     * 101 x 212 = 	21412	21412		TRUE
     * 101 x 222 = 	22422	22422		TRUE
     * 101 x 232 = 	23432	23432		TRUE
     * 101 x 242 = 	24442	24442		TRUE
     * 101 x 252 = 	25452	25452		TRUE
     * 101 x 262 = 	26462	26462		TRUE
     * 101 x 272 = 	27472	27472		TRUE
     * 101 x 282 = 	28482	28482		TRUE
     * 101 x 292 = 	29492	29492		TRUE
     * 102 x 201 = 	20502	20502		TRUE
     * 102 x 206 = 	21012	21012		TRUE
     * 103 x 204 = 	21012	21012		TRUE
     * 103 x 254 = 	26162	26162		TRUE
     * 104 x 203 = 	21112	21112		TRUE
     * 104 x 268 = 	27872	27872		TRUE
     * 106 x 202 = 	21412	21412		TRUE
     * 106 x 222 = 	23532	23532		TRUE
     * 106 x 242 = 	25652	25652		TRUE
     * 106 x 262 = 	27772	27772		TRUE
     * 106 x 282 = 	29892	29892		TRUE
     * 107 x 236 = 	25252	25252		TRUE
     * 108 x 259 = 	27972	27972		TRUE
     * 108 x 274 = 	29592	29592		TRUE
     * 109 x 139 = 	15151	15151		TRUE
     * 111 x 101 = 	11211	11211		TRUE
     * 111 x 111 = 	12321	12321		TRUE
     * 111 x 121 = 	13431	13431		TRUE
     * 111 x 131 = 	14541	14541		TRUE
     * 111 x 141 = 	15651	15651		TRUE
     * 111 x 151 = 	16761	16761		TRUE
     * 111 x 161 = 	17871	17871		TRUE
     * 111 x 171 = 	18981	18981		TRUE
     * 111 x 182 = 	20202	20202		TRUE
     * 111 x 192 = 	21312	21312		TRUE
     * 111 x 202 = 	22422	22422		TRUE
     * 111 x 212 = 	23532	23532		TRUE
     * 111 x 222 = 	24642	24642		TRUE
     * 111 x 232 = 	25752	25752		TRUE
     * 111 x 242 = 	26862	26862		TRUE
     * 111 x 252 = 	27972	27972		TRUE
     * 111 x 273 = 	30303	30303		TRUE
     * 111 x 283 = 	31413	31413		TRUE
     * 111 x 293 = 	32523	32523		TRUE
     * 112 x 211 = 	23632	23632		TRUE
     * 112 x 266 = 	29792	29792		TRUE
     * 113 x 244 = 	27572	27572		TRUE
     * 114 x 233 = 	26562	26562		TRUE
     * 116 x 182 = 	21112	21112		TRUE
     * 116 x 202 = 	23432	23432		TRUE
     * 116 x 222 = 	25752	25752		TRUE
     * 117 x 246 = 	28782	28782		TRUE
     * 117 x 259 = 	30303	30303		TRUE
     * 118 x 184 = 	21712	21712		TRUE
     * 118 x 214 = 	25252	25252		TRUE
     * 119 x 129 = 	15351	15351		TRUE
     * 121 x 101 = 	12221	12221		TRUE
     * 121 x 111 = 	13431	13431		TRUE
     * 121 x 121 = 	14641	14641		TRUE
     * 121 x 131 = 	15851	15851		TRUE
     * 121 x 182 = 	22022	22022		TRUE
     * 121 x 192 = 	23232	23232		TRUE
     * 121 x 202 = 	24442	24442		TRUE
     * 121 x 212 = 	25652	25652		TRUE
     * 121 x 222 = 	26862	26862		TRUE
     * 121 x 273 = 	33033	33033		TRUE
     * 121 x 283 = 	34243	34243		TRUE
     * 121 x 293 = 	35453	35453		TRUE
     * 122 x 221 = 	26962	26962		TRUE
     * 122 x 226 = 	27572	27572		TRUE
     * 122 x 231 = 	28182	28182		TRUE
     * 123 x 147 = 	18081	18081		TRUE
     * 123 x 234 = 	28782	28782		TRUE
     * 123 x 271 = 	33333	33333		TRUE
     * 124 x 193 = 	23932	23932		TRUE
     * 126 x 202 = 	25452	25452		TRUE
     * 126 x 222 = 	27972	27972		TRUE
     * 127 x 206 = 	26162	26162		TRUE
     * 127 x 299 = 	37973	37973		TRUE
     * 129 x 119 = 	15351	15351		TRUE
     * 129 x 267 = 	34443	34443		TRUE
     * 131 x 101 = 	13231	13231		TRUE
     * 131 x 111 = 	14541	14541		TRUE
     * 131 x 121 = 	15851	15851		TRUE
     * 131 x 192 = 	25152	25152		TRUE
     * 131 x 202 = 	26462	26462		TRUE
     * 131 x 212 = 	27772	27772		TRUE
     * 131 x 283 = 	37073	37073		TRUE
     * 131 x 293 = 	38383	38383		TRUE
     * 132 x 166 = 	21912	21912		TRUE
     * 132 x 176 = 	23232	23232		TRUE
     * 133 x 164 = 	21812	21812		TRUE
     * 133 x 224 = 	29792	29792		TRUE
     * 133 x 281 = 	37373	37373		TRUE
     * 134 x 153 = 	20502	20502		TRUE
     * 134 x 208 = 	27872	27872		TRUE
     * 136 x 202 = 	27472	27472		TRUE
     * 137 x 143 = 	19591	19591		TRUE
     * 137 x 146 = 	20002	20002		TRUE
     * 137 x 216 = 	29592	29592		TRUE
     * 137 x 219 = 	30003	30003		TRUE
     * 137 x 289 = 	39593	39593		TRUE
     * 137 x 292 = 	40004	40004		TRUE
     * 139 x 109 = 	15151	15151		TRUE
     * 139 x 178 = 	24742	24742		TRUE
     * 139 x 287 = 	39893	39893		TRUE
     * 141 x 101 = 	14241	14241		TRUE
     * 141 x 111 = 	15651	15651		TRUE
     * 141 x 192 = 	27072	27072		TRUE
     * 141 x 202 = 	28482	28482		TRUE
     * 141 x 212 = 	29892	29892		TRUE
     * 143 x 137 = 	19591	19591		TRUE
     * 143 x 154 = 	22022	22022		TRUE
     * 143 x 231 = 	33033	33033		TRUE
     * 144 x 148 = 	21312	21312		TRUE
     * 144 x 188 = 	27072	27072		TRUE
     * 144 x 296 = 	42624	42624		TRUE
     * 146 x 137 = 	20002	20002		TRUE
     * 146 x 157 = 	22922	22922		TRUE
     * 146 x 202 = 	29492	29492		TRUE
     * 146 x 274 = 	40004	40004		TRUE
     * 146 x 294 = 	42924	42924		TRUE
     * 147 x 123 = 	18081	18081		TRUE
     * 147 x 292 = 	42924	42924		TRUE
     * 148 x 144 = 	21312	21312		TRUE
     * 148 x 159 = 	23532	23532		TRUE
     * 148 x 174 = 	25752	25752		TRUE
     * 148 x 189 = 	27972	27972		TRUE
     * 148 x 273 = 	40404	40404		TRUE
     * 148 x 288 = 	42624	42624		TRUE
     * 151 x 101 = 	15251	15251		TRUE
     * 151 x 111 = 	16761	16761		TRUE
     * 152 x 196 = 	29792	29792		TRUE
     * 153 x 134 = 	20502	20502		TRUE
     * 154 x 143 = 	22022	22022		TRUE
     * 154 x 183 = 	28182	28182		TRUE
     * 154 x 286 = 	44044	44044		TRUE
     * 156 x 259 = 	40404	40404		TRUE
     * 157 x 146 = 	22922	22922		TRUE
     * 157 x 166 = 	26062	26062		TRUE
     * 157 x 229 = 	35953	35953		TRUE
     * 157 x 249 = 	39093	39093		TRUE
     * 158 x 179 = 	28282	28282		TRUE
     * 158 x 273 = 	43134	43134		TRUE
     * 159 x 148 = 	23532	23532		TRUE
     * 159 x 188 = 	29892	29892		TRUE
     * 159 x 256 = 	40704	40704		TRUE
     * 161 x 101 = 	16261	16261		TRUE
     * 161 x 111 = 	17871	17871		TRUE
     * 163 x 184 = 	29992	29992		TRUE
     * 164 x 133 = 	21812	21812		TRUE
     * 164 x 178 = 	29192	29192		TRUE
     * 164 x 271 = 	44444	44444		TRUE
     * 166 x 132 = 	21912	21912		TRUE
     * 166 x 157 = 	26062	26062		TRUE
     * 166 x 244 = 	40504	40504		TRUE
     * 166 x 289 = 	47974	47974		TRUE
     * 167 x 176 = 	29392	29392		TRUE
     * 167 x 199 = 	33233	33233		TRUE
     * 168 x 288 = 	48384	48384		TRUE
     * 171 x 101 = 	17271	17271		TRUE
     * 171 x 111 = 	18981	18981		TRUE
     * 171 x 254 = 	43434	43434		TRUE
     * 173 x 181 = 	31313	31313		TRUE
     * 173 x 268 = 	46364	46364		TRUE
     * 174 x 148 = 	25752	25752		TRUE
     * 174 x 256 = 	44544	44544		TRUE
     * 175 x 299 = 	52325	52325		TRUE
     * 176 x 132 = 	23232	23232		TRUE
     * 176 x 167 = 	29392	29392		TRUE
     * 176 x 229 = 	40304	40304		TRUE
     * 176 x 264 = 	46464	46464		TRUE
     * 178 x 139 = 	24742	24742		TRUE
     * 178 x 164 = 	29192	29192		TRUE
     * 178 x 248 = 	44144	44144		TRUE
     * 179 x 158 = 	28282	28282		TRUE
     * 179 x 285 = 	51015	51015		TRUE
     * 181 x 101 = 	18281	18281		TRUE
     * 181 x 173 = 	31313	31313		TRUE
     * 181 x 274 = 	49594	49594		TRUE
     * 182 x 111 = 	20202	20202		TRUE
     * 182 x 116 = 	21112	21112		TRUE
     * 182 x 121 = 	22022	22022		TRUE
     * 182 x 222 = 	40404	40404		TRUE
     * 182 x 227 = 	41314	41314		TRUE
     * 182 x 232 = 	42224	42224		TRUE
     * 182 x 237 = 	43134	43134		TRUE
     * 182 x 242 = 	44044	44044		TRUE
     * 183 x 154 = 	28182	28182		TRUE
     * 184 x 118 = 	21712	21712		TRUE
     * 184 x 163 = 	29992	29992		TRUE
     * 184 x 241 = 	44344	44344		TRUE
     * 185 x 273 = 	50505	50505		TRUE
     * 185 x 279 = 	51615	51615		TRUE
     * 185 x 285 = 	52725	52725		TRUE
     * 185 x 291 = 	53835	53835		TRUE
     * 185 x 297 = 	54945	54945		TRUE
     * 187 x 222 = 	41514	41514		TRUE
     * 187 x 242 = 	45254	45254		TRUE
     * 188 x 144 = 	27072	27072		TRUE
     * 188 x 159 = 	29892	29892		TRUE
     * 188 x 238 = 	44744	44744		TRUE
     * 189 x 148 = 	27972	27972		TRUE
     * 189 x 256 = 	48384	48384		TRUE
     * 189 x 295 = 	55755	55755		TRUE
     * 191 x 101 = 	19291	19291		TRUE
     * 191 x 193 = 	36863	36863		TRUE
     * 191 x 275 = 	52525	52525		TRUE
     * 192 x 111 = 	21312	21312		TRUE
     * 192 x 121 = 	23232	23232		TRUE
     * 192 x 131 = 	25152	25152		TRUE
     * 192 x 141 = 	27072	27072		TRUE
     * 192 x 212 = 	40704	40704		TRUE
     * 192 x 222 = 	42624	42624		TRUE
     * 192 x 232 = 	44544	44544		TRUE
     * 192 x 242 = 	46464	46464		TRUE
     * 192 x 252 = 	48384	48384		TRUE
     * 193 x 124 = 	23932	23932		TRUE
     * 193 x 191 = 	36863	36863		TRUE
     * 193 x 258 = 	49794	49794		TRUE
     * 195 x 259 = 	50505	50505		TRUE
     * 195 x 273 = 	53235	53235		TRUE
     * 196 x 152 = 	29792	29792		TRUE
     * 196 x 219 = 	42924	42924		TRUE
     * 197 x 222 = 	43734	43734		TRUE
     * 197 x 242 = 	47674	47674		TRUE
     * 199 x 167 = 	33233	33233		TRUE
     * 199 x 236 = 	46964	46964		TRUE
     * 201 x 102 = 	20502	20502		TRUE
     * 201 x 295 = 	59295	59295		TRUE
     * 202 x 101 = 	20402	20402		TRUE
     * 202 x 106 = 	21412	21412		TRUE
     * 202 x 111 = 	22422	22422		TRUE
     * 202 x 116 = 	23432	23432		TRUE
     * 202 x 121 = 	24442	24442		TRUE
     * 202 x 126 = 	25452	25452		TRUE
     * 202 x 131 = 	26462	26462		TRUE
     * 202 x 136 = 	27472	27472		TRUE
     * 202 x 141 = 	28482	28482		TRUE
     * 202 x 146 = 	29492	29492		TRUE
     * 202 x 202 = 	40804	40804		TRUE
     * 202 x 207 = 	41814	41814		TRUE
     * 202 x 212 = 	42824	42824		TRUE
     * 202 x 217 = 	43834	43834		TRUE
     * 202 x 222 = 	44844	44844		TRUE
     * 202 x 227 = 	45854	45854		TRUE
     * 202 x 232 = 	46864	46864		TRUE
     * 202 x 237 = 	47874	47874		TRUE
     * 202 x 242 = 	48884	48884		TRUE
     * 202 x 247 = 	49894	49894		TRUE
     * 203 x 104 = 	21112	21112		TRUE
     * 203 x 208 = 	42224	42224		TRUE
     * 204 x 103 = 	21012	21012		TRUE
     * 204 x 206 = 	42024	42024		TRUE
     * 205 x 271 = 	55555	55555		TRUE
     * 206 x 102 = 	21012	21012		TRUE
     * 206 x 127 = 	26162	26162		TRUE
     * 206 x 204 = 	42024	42024		TRUE
     * 206 x 229 = 	47174	47174		TRUE
     * 207 x 202 = 	41814	41814		TRUE
     * 207 x 222 = 	45954	45954		TRUE
     * 208 x 134 = 	27872	27872		TRUE
     * 208 x 203 = 	42224	42224		TRUE
     * 209 x 275 = 	57475	57475		TRUE
     * 211 x 112 = 	23632	23632		TRUE
     * 211 x 214 = 	45154	45154		TRUE
     * 212 x 101 = 	21412	21412		TRUE
     * 212 x 111 = 	23532	23532		TRUE
     * 212 x 121 = 	25652	25652		TRUE
     * 212 x 131 = 	27772	27772		TRUE
     * 212 x 141 = 	29892	29892		TRUE
     * 212 x 192 = 	40704	40704		TRUE
     * 212 x 202 = 	42824	42824		TRUE
     * 212 x 212 = 	44944	44944		TRUE
     * 214 x 118 = 	25252	25252		TRUE
     * 214 x 211 = 	45154	45154		TRUE
     * 215 x 241 = 	51815	51815		TRUE
     * 215 x 249 = 	53535	53535		TRUE
     * 215 x 257 = 	55255	55255		TRUE
     * 216 x 137 = 	29592	29592		TRUE
     * 216 x 224 = 	48384	48384		TRUE
     * 216 x 296 = 	63936	63936		TRUE
     * 217 x 202 = 	43834	43834		TRUE
     * 218 x 297 = 	64746	64746		TRUE
     * 219 x 137 = 	30003	30003		TRUE
     * 219 x 196 = 	42924	42924		TRUE
     * 219 x 226 = 	49494	49494		TRUE
     * 219 x 274 = 	60006	60006		TRUE
     * 221 x 122 = 	26962	26962		TRUE
     * 221 x 245 = 	54145	54145		TRUE
     * 222 x 101 = 	22422	22422		TRUE
     * 222 x 106 = 	23532	23532		TRUE
     * 222 x 111 = 	24642	24642		TRUE
     * 222 x 116 = 	25752	25752		TRUE
     * 222 x 121 = 	26862	26862		TRUE
     * 222 x 126 = 	27972	27972		TRUE
     * 222 x 182 = 	40404	40404		TRUE
     * 222 x 187 = 	41514	41514		TRUE
     * 222 x 192 = 	42624	42624		TRUE
     * 222 x 197 = 	43734	43734		TRUE
     * 222 x 202 = 	44844	44844		TRUE
     * 222 x 207 = 	45954	45954		TRUE
     * 222 x 273 = 	60606	60606		TRUE
     * 222 x 278 = 	61716	61716		TRUE
     * 222 x 283 = 	62826	62826		TRUE
     * 222 x 288 = 	63936	63936		TRUE
     * 223 x 255 = 	56865	56865		TRUE
     * 223 x 265 = 	59095	59095		TRUE
     * 224 x 133 = 	29792	29792		TRUE
     * 224 x 216 = 	48384	48384		TRUE
     * 224 x 294 = 	65856	65856		TRUE
     * 225 x 233 = 	52425	52425		TRUE
     * 225 x 255 = 	57375	57375		TRUE
     * 226 x 122 = 	27572	27572		TRUE
     * 226 x 219 = 	49494	49494		TRUE
     * 227 x 182 = 	41314	41314		TRUE
     * 227 x 202 = 	45854	45854		TRUE
     * 229 x 157 = 	35953	35953		TRUE
     * 229 x 176 = 	40304	40304		TRUE
     * 229 x 206 = 	47174	47174		TRUE
     * 231 x 122 = 	28182	28182		TRUE
     * 231 x 143 = 	33033	33033		TRUE
     * 231 x 286 = 	66066	66066		TRUE
     * 232 x 101 = 	23432	23432		TRUE
     * 232 x 111 = 	25752	25752		TRUE
     * 232 x 182 = 	42224	42224		TRUE
     * 232 x 192 = 	44544	44544		TRUE
     * 232 x 202 = 	46864	46864		TRUE
     * 232 x 263 = 	61016	61016		TRUE
     * 232 x 273 = 	63336	63336		TRUE
     * 232 x 283 = 	65656	65656		TRUE
     * 232 x 293 = 	67976	67976		TRUE
     * 233 x 114 = 	26562	26562		TRUE
     * 233 x 225 = 	52425	52425		TRUE
     * 234 x 123 = 	28782	28782		TRUE
     * 234 x 259 = 	60606	60606		TRUE
     * 235 x 239 = 	56165	56165		TRUE
     * 235 x 245 = 	57575	57575		TRUE
     * 235 x 251 = 	58985	58985		TRUE
     * 236 x 107 = 	25252	25252		TRUE
     * 236 x 199 = 	46964	46964		TRUE
     * 237 x 182 = 	43134	43134		TRUE
     * 237 x 202 = 	47874	47874		TRUE
     * 238 x 188 = 	44744	44744		TRUE
     * 238 x 292 = 	69496	69496		TRUE
     * 239 x 235 = 	56165	56165		TRUE
     * 239 x 254 = 	60706	60706		TRUE
     * 239 x 284 = 	67876	67876		TRUE
     * 241 x 184 = 	44344	44344		TRUE
     * 241 x 215 = 	51815	51815		TRUE
     * 242 x 101 = 	24442	24442		TRUE
     * 242 x 106 = 	25652	25652		TRUE
     * 242 x 111 = 	26862	26862		TRUE
     * 242 x 182 = 	44044	44044		TRUE
     * 242 x 187 = 	45254	45254		TRUE
     * 242 x 192 = 	46464	46464		TRUE
     * 242 x 197 = 	47674	47674		TRUE
     * 242 x 202 = 	48884	48884		TRUE
     * 242 x 273 = 	66066	66066		TRUE
     * 242 x 278 = 	67276	67276		TRUE
     * 242 x 283 = 	68486	68486		TRUE
     * 242 x 288 = 	69696	69696		TRUE
     * 244 x 113 = 	27572	27572		TRUE
     * 244 x 166 = 	40504	40504		TRUE
     * 244 x 284 = 	69296	69296		TRUE
     * 245 x 221 = 	54145	54145		TRUE
     * 245 x 235 = 	57575	57575		TRUE
     * 246 x 117 = 	28782	28782		TRUE
     * 246 x 271 = 	66666	66666		TRUE
     * 247 x 202 = 	49894	49894		trUE
     * 248 x 178 = 	44144	44144		TRUE
     * 248 x 257 = 	63736	63736		TRUE
     * 249 x 157 = 	39093	39093		TRUE
     * 249 x 215 = 	53535	53535		TRUE
     * 251 x 235 = 	58985	58985		TRUE
     * 251 x 266 = 	66766	66766		TRUE
     * 251 x 297 = 	74547	74547		TRUE
     * 252 x 101 = 	25452	25452		TRUE
     * 252 x 111 = 	27972	27972		TRUE
     * 252 x 192 = 	48384	48384		TRUE
     * 254 x 103 = 	26162	26162		TRUE
     * 254 x 171 = 	43434	43434		TRUE
     * 254 x 239 = 	60706	60706		TRUE
     * 254 x 274 = 	69596	69596		TRUE
     * 255 x 223 = 	56865	56865		TRUE
     * 255 x 225 = 	57375	57375		TRUE
     * 256 x 159 = 	40704	40704		TRUE
     * 256 x 174 = 	44544	44544		TRUE
     * 256 x 189 = 	48384	48384		TRUE
     * 257 x 215 = 	55255	55255		TRUE
     * 257 x 248 = 	63736	63736		TRUE
     * 258 x 193 = 	49794	49794		TRUE
     * 258 x 267 = 	68886	68886		TRUE
     * 259 x 108 = 	27972	27972		TRUE
     * 259 x 117 = 	30303	30303		TRUE
     * 259 x 156 = 	40404	40404		TRUE
     * 259 x 195 = 	50505	50505		TRUE
     * 259 x 234 = 	60606	60606		TRUE
     * 259 x 273 = 	70707	70707		TRUE
     * 262 x 101 = 	26462	26462		TRUE
     * 262 x 106 = 	27772	27772		TRUE
     * 263 x 232 = 	61016	61016		TRUE
     * 264 x 176 = 	46464	46464		TRUE
     * 264 x 264 = 	69696	69696		TRUE
     * 265 x 223 = 	59095	59095		TRUE
     * 266 x 112 = 	29792	29792		TRUE
     * 266 x 251 = 	66766	66766		TRUE
     * 267 x 129 = 	34443	34443		TRUE
     * 267 x 258 = 	68886	68886		TRUE
     * 268 x 104 = 	27872	27872		TRUE
     * 268 x 173 = 	46364	46364		TRUE
     * 269 x 273 = 	73437	73437		TRUE
     * 271 x 123 = 	33333	33333		TRUE
     * 271 x 164 = 	44444	44444		TRUE
     * 271 x 205 = 	55555	55555		TRUE
     * 271 x 246 = 	66666	66666		TRUE
     * 271 x 287 = 	77777	77777		TRUE
     * 272 x 101 = 	27472	27472		TRUE
     * 273 x 111 = 	30303	30303		TRUE
     * 273 x 121 = 	33033	33033		TRUE
     * 273 x 148 = 	40404	40404		TRUE
     * 273 x 158 = 	43134	43134		TRUE
     * 273 x 185 = 	50505	50505		TRUE
     * 273 x 195 = 	53235	53235		TRUE
     * 273 x 222 = 	60606	60606		TRUE
     * 273 x 232 = 	63336	63336		TRUE
     * 273 x 242 = 	66066	66066		TRUE
     * 273 x 259 = 	70707	70707		TRUE
     * 273 x 269 = 	73437	73437		TRUE
     * 273 x 279 = 	76167	76167		TRUE
     * 273 x 296 = 	80808	80808		TRUE
     * 274 x 108 = 	29592	29592		TRUE
     * 274 x 146 = 	40004	40004		TRUE
     * 274 x 181 = 	49594	49594		TRUE
     * 274 x 219 = 	60006	60006		TRUE
     * 274 x 254 = 	69596	69596		TRUE
     * 274 x 292 = 	80008	80008		TRUE
     * 275 x 191 = 	52525	52525		TRUE
     * 275 x 209 = 	57475	57475		TRUE
     * 278 x 222 = 	61716	61716		TRUE
     * 278 x 242 = 	67276	67276		TRUE
     * 279 x 185 = 	51615	51615		TRUE
     * 279 x 273 = 	76167	76167		TRUE
     * 281 x 133 = 	37373	37373		TRUE
     * 281 x 298 = 	83738	83738		TRUE
     * 282 x 101 = 	28482	28482		TRUE
     * 282 x 106 = 	29892	29892		TRUE
     * 283 x 111 = 	31413	31413		TRUE
     * 283 x 121 = 	34243	34243		TRUE
     * 283 x 131 = 	37073	37073		TRUE
     * 283 x 222 = 	62826	62826		TRUE
     * 283 x 232 = 	65656	65656		TRUE
     * 283 x 242 = 	68486	68486		TRUE
     * 284 x 239 = 	67876	67876		TRUE
     * 284 x 244 = 	69296	69296		TRUE
     * 284 x 292 = 	82928	82928		TRUE
     * 284 x 297 = 	84348	84348		TRUE
     * 285 x 179 = 	51015	51015		TRUE
     * 285 x 185 = 	52725	52725		TRUE
     * 286 x 154 = 	44044	44044		TRUE
     * 286 x 231 = 	66066	66066		TRUE
     * 287 x 139 = 	39893	39893		TRUE
     * 287 x 271 = 	77777	77777		TRUE
     * 288 x 148 = 	42624	42624		TRUE
     * 288 x 168 = 	48384	48384		TRUE
     * 288 x 222 = 	63936	63936		TRUE
     * 288 x 242 = 	69696	69696		TRUE
     * 289 x 137 = 	39593	39593		TRUE
     * 289 x 166 = 	47974	47974		TRUE
     * 291 x 185 = 	53835	53835		TRUE
     * 292 x 101 = 	29492	29492		TRUE
     * 292 x 137 = 	40004	40004		TRUE
     * 292 x 147 = 	42924	42924		TRUE
     * 292 x 238 = 	69496	69496		TRUE
     * 292 x 274 = 	80008	80008		TRUE
     * 292 x 284 = 	82928	82928		TRUE
     * 293 x 111 = 	32523	32523		TRUE
     * 293 x 121 = 	35453	35453		TRUE
     * 293 x 131 = 	38383	38383		TRUE
     * 293 x 232 = 	67976	67976		TRUE
     * 294 x 146 = 	42924	42924		TRUE
     * 294 x 224 = 	65856	65856		TRUE
     * 295 x 189 = 	55755	55755		TRUE
     * 295 x 201 = 	59295	59295		TRUE
     * 296 x 144 = 	42624	42624		TRUE
     * 296 x 216 = 	63936	63936		TRUE
     * 296 x 273 = 	80808	80808		TRUE
     * 297 x 185 = 	54945	54945		TRUE
     * 297 x 218 = 	64746	64746		TRUE
     * 297 x 251 = 	74547	74547		TRUE
     * 297 x 284 = 	84348	84348		TRUE
     * 298 x 281 = 	83738	83738		TRUE
     * 299 x 127 = 	37973	37973		TRUE
     * 299 x 175 = 	52325	52325		TRUE
     *
     * 297 x 284 = 	84348	84348		TRUE
     *
     * 319 x 369 = 	117711	117711		TRUE
     * 369 x 319 = 	117711	117711		TRUE
     * 341 x 381 = 	129921	129921		TRUE
     * 381 x 341 = 	129921	129921		TRUE
     * 341 x 391 = 	133331	133331		TRUE
     * 391 x 341 = 	133331	133331		TRUE
     *
     *
     * 917 x 429 = 	393393	393393		TRUE
     * 946 x 424 = 	401104	401104		TRUE
     * 978 x 418 = 	408804	408804		TRUE
     * 914 x 451 = 	412214	412214		TRUE
     * 966 x 429 = 	414414	414414		TRUE
     * 946 x 444 = 	420024	420024		TRUE
     * 968 x 443 = 	428824	428824		TRUE
     * 979 x 446 = 	436634	436634		TRUE
     * 916 x 484 = 	443344	443344		TRUE
     * 968 x 458 = 	443344	443344		TRUE
     * 924 x 481 = 	444444	444444		TRUE
     * 962 x 462 = 	444444	444444		TRUE
     * 913 x 488 = 	445544	445544		TRUE
     * 971 x 484 = 	469964	469964		TRUE
     * 929 x 506 = 	470074	470074		TRUE
     * 922 x 517 = 	476674	476674		TRUE
     * 979 x 496 = 	485584	485584		TRUE
     * 964 x 506 = 	487784	487784		TRUE
     * 928 x 528 = 	489984	489984		TRUE
     * 957 x 512 = 	489984	489984		TRUE
     * 913 x 538 = 	491194	491194		TRUE
     * 935 x 543 = 	507705	507705		TRUE
     * 915 x 561 = 	513315	513315		TRUE
     * 935 x 549 = 	513315	513315		TRUE
     * 995 x 517 = 	514415	514415		TRUE
     * 975 x 539 = 	525525	525525		TRUE
     * 957 x 555 = 	531135	531135		TRUE
     * 979 x 555 = 	543345	543345		TRUE
     * 935 x 587 = 	548845	548845		TRUE
     * 935 x 593 = 	554455	554455		TRUE
     * 935 x 599 = 	560065	560065		TRUE
     * 933 x 605 = 	564465	564465		TRUE
     * 955 x 605 = 	577775	577775		TRUE
     * 925 x 627 = 	579975	579975		TRUE
     * 995 x 583 = 	580085	580085		TRUE
     * 913 x 645 = 	588885	588885		TRUE
     * 935 x 631 = 	589985	589985		TRUE
     * 979 x 605 = 	592295	592295		TRUE
     * 935 x 637 = 	595595	595595		TRUE
     * 979 x 614 = 	601106	601106		TRUE
     * 913 x 662 = 	604406	604406		TRUE
     * 946 x 646 = 	611116	611116		TRUE
     * 968 x 637 = 	616616	616616		TRUE
     * 977 x 638 = 	623326	623326		TRUE
     * 946 x 666 = 	630036	630036		TRUE
     * 968 x 652 = 	631136	631136		TRUE
     * 924 x 689 = 	636636	636636		TRUE
     * 957 x 678 = 	648846	648846		TRUE
     * 953 x 682 = 	649946	649946		TRUE
     * 913 x 712 = 	650056	650056		TRUE
     * 979 x 664 = 	650056	650056		TRUE
     * 958 x 682 = 	653356	653356		TRUE
     * 962 x 693 = 	666666	666666		TRUE
     * 926 x 726 = 	672276	672276		TRUE
     * 927 x 748 = 	693396	693396		TRUE
     * 924 x 754 = 	696696	696696		TRUE
     * 957 x 728 = 	696696	696696		TRUE
     * 968 x 722 = 	698896	698896		TRUE
     * 953 x 759 = 	723327	723327		TRUE
     * 913 x 819 = 	747747	747747		TRUE
     * 959 x 803 = 	770077	770077		TRUE
     * 921 x 847 = 	780087	780087		TRUE
     * 913 x 869 = 	793397	793397		TRUE
     * 924 x 867 = 	801108	801108		TRUE
     * 946 x 848 = 	802208	802208		TRUE
     * 968 x 831 = 	804408	804408		TRUE
     * 957 x 844 = 	807708	807708		TRUE
     * 932 x 869 = 	809908	809908		TRUE
     * 946 x 868 = 	821128	821128		TRUE
     * 914 x 902 = 	824428	824428		TRUE
     * 924 x 897 = 	828828	828828		TRUE
     * 966 x 858 = 	828828	828828		TRUE
     * 946 x 888 = 	840048	840048		TRUE
     * 982 x 869 = 	853358	853358		TRUE
     * 957 x 894 = 	855558	855558		TRUE
     * 924 x 932 = 	861168	861168		TRUE
     * 932 x 924 = 	861168	861168		TRUE
     * 916 x 968 = 	886688	886688		TRUE
     * 968 x 916 = 	886688	886688		TRUE
     * 924 x 962 = 	888888	888888		TRUE
     * 962 x 924 = 	888888	888888		TRUE
     * 913 x 993 = 	906609	906609		TRUE
     * 993 x 913 = 	906609	906609		TRUE
     *
     * 913 x 993 = 	906609	906609		TRUE
     * 993 x 913 = 	906609	906609		TRUE
     *  */

    @Disabled
    @Test
    void palindromicNumer() {
        int i,j;
        int x = 999;
        int y = 999;
//    Long target = Long.valueOf("8462696833");
        for (i = 400; i < x; ++i) {
            for (j = 400; j < y; ++j) {
                System.out.println(i + " x " + j + " = \t" + i*j);
            }
        }
    }

    @Disabled
    @Test
    void Smallestmultiple() {
        int i,j;
        int x = 999;
        int y = 999;
        String  teststr;
        System.out.println("start of test");

        for (i = 4; i <  2147483647; ++i) {
            teststr = i % 3  + "-" +  i % 4  + "-" +  i % 5  + "-" +  i % 6  + "-" +  i % 7  + "-" +  i % 8  + "-" +  i % 9  + "-" +  i % 10
                    + i % 11  + "-" +  i % 12  + "-" +  i % 13  + "-" +  i % 14  + "-" +  i % 15  + "-" +  i % 16  + "-" +  i % 17  + "-" +  i % 18 + "-"
                    +  i % 19  + "-" +  i % 20;
            if (teststr =="0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0")
            {
                System.out.println(i);
            }
            //              System.out.println(i + " -- " + i % 3  + "-" +  i % 4  + "-" +  i % 5  + "-" +  i % 6  + "-" +  i % 7  + "-" +  i % 8  + "-" +  i % 9  + "-" +  i % 10
            //                    + i % 11  + "-" +  i % 12  + "-" +  i % 13  + "-" +  i % 14  + "-" +  i % 15  + "-" +  i % 16  + "-" +  i % 17  + "-" +  i % 18 + "-"
            //
            //                  +  i % 19  + "-" +  i % 20 );

        }
        System.out.println("end of test");

    }

    @Disabled
    @Test
    void SmallestmultipleLong() {
        Long i = Long.valueOf("0");
        int x = 999;
        int y = 999;
        String  teststr;
        System.out.println("start of test");
        Long target = Long.valueOf("9223372036854775807");

        //       for (i = Long.valueOf("2147483647"); i <  target; ++i) {
        for (i = Long.valueOf("6000000000"); i <  Long.parseLong("70000000000"); ++i) {
            teststr = i % 6 + "-" + i % 7 + "-" + i % 11 + "-" + i % 12 + "-" + i % 13 + "-" + i % 14 + "-" + i % 15  + "-" +  i % 16  + "-" +  i % 17  + "-" +  i % 18 + "-"
                    +  i % 19  + "-" +  i % 20;
            //           System.out.println( i % 6 + "-" + i % 7 + "-" + i % 11 + "-" + i % 12 + "-" + i % 13 + "-" + i % 14 + "-" + i % 15  + "-" +  i % 16  + "-" +  i % 17  + "-" +  i % 18 + "-"
            //                 +  i % 19  + "-" +  i % 20 );

            if (teststr =="0-0-0-0-0-0-0-0-0-0-0-0")
            {
                System.out.println(i);
            }
        }
        System.out.println("end of test");
    }

    @Disabled
    @Test
    void SmallestmultipleLongerSmarter() {
        Long i;
        int x = 999;
        int y = 999;
        String  teststr;
        System.out.println("start of test");
        Long target = Long.valueOf("9223372036854775807");

        //       for (i = Long.valueOf("2147483647"); i <  target; ++i) {
        for (i = Long.valueOf("0"); i <  Long.parseLong("1000000000"); ++i) {
            if (i % Long.valueOf("19") == 0) {
                //           System.out.println(i + " - multiple of 19");
                if (i % Long.valueOf("17") == 0) {
                    //             System.out.println(i + " - multiple of 19 & 17");
                    if (i % Long.valueOf("13") == 0) {
//                        System.out.println(i + " - multiple of 19 & 17 & 13");
                        if (i % Long.valueOf("11") == 0) {
//                            System.out.println(i + " - multiple of 19, 17, 13, 11");
                            if (i % Long.valueOf("7") == 0) {
//                                System.out.println(i + " - multiple of 19, 17, 13, 11, 7");
                                if (i % Long.valueOf("2") == 0) {
                                    //         System.out.println(i + " - multiple of 19, 17, 13, 11, 7, 2");
                                    if (i % Long.valueOf("3") == 0) {
                                        //                                     System.out.println(i + " - multiple of 19, 17, 13, 11, 7, 2, 3");
                                        if (i % Long.valueOf("5") == 0) {
                                            //                                           System.out.println(i + " - multiple of 19, 17, 13, 11, 7, 2, 3, 5");
                                            if (i % Long.valueOf("18") == 0) {
//                                                System.out.println(i + " - multiple of 19, 18, 17, 13, 11, 7, 2, 3, 5");
                                                if (i % Long.valueOf("16") == 0) {
                                                    //                             System.out.println(i + " - multiple of 19, 18, 17, 16, 13, 11, 7, 2, 3, 5");
                                                    if (i % Long.valueOf("20") == 0) {
                                                        //                System.out.println(i + " - multiple of 20, 19, 18, 17, 16, 13, 11, 7, 2, 3, 5");
                                                        if (i % Long.valueOf("15") == 0) {
//                                                            System.out.println(i + " - multiple of 20, 19, 18, 17, 16, 15, 13, 11, 7, 2, 3, 5");
                                                            if (i % Long.valueOf("15") == 0) {
                                                                System.out.println(i + " - multiple of 20, 19, 18, 17, 16, 15, 13, 11, 7, 2, 3, 5");
                                                            }                                                      }
                                                    }                                                }                                            }
                                        }                                    }                                }                            }
                        }                    }                }
            }

        }   // end of for loop
        System.out.println("end of test");
    }

    /**
     * Sum square difference
     *
     * Problem 6
     * The sum of the squares of the first ten natural numbers is,
     *
     * 12 + 22 + ... + 102 = 385
     * The square of the sum of the first ten natural numbers is,
     *
     * (1 + 2 + ... + 10)2 = 552 = 3025
     * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
     * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */

    @Disabled
    @Test
    void sumSquareDifference() {
        int i;
        System.out.println("start of test");
        int sum = 1*1 + 2*2 + 3*3 + 4*4 + 5*5 + 6*6 + 7*7 + 8*8 + 9*9 + 10*10;
        double squaresum = Math.pow((1+2+3+4+5+6+7+8+9+10),2);

        double diff = squaresum - sum;
        for (i = 1; i <  100; ++i) {

        }
        System.out.println("end of test = " + sum + " " + squaresum + " " + diff);
    }

    @Test
    void sumSquareDifference100() {
        int i,j;
        System.out.println("start of test");
        //       int sum = 1*1 + 2*2 + 3*3 + 4*4 + 5*5 + 6*6 + 7*7 + 8*8 + 9*9 + 10*10;
        double squaresum = Math.pow((1+2+3+4+5+6+7+8+9+10),2);

        double sum = 0;
        double sum100 = 0;
        double diff = squaresum - sum;
        for (i = 1; i <=  100; ++i) {
            sum = sum + Math.pow(i,2);
        }
        for (j = 1; j <=  100; ++j) {
            sum100 = sum100 + j;
        }
        System.out.println("end of test = " + sum + " " + sum100 +"xxxxxx " + (Math.pow(sum100,2) - sum) );
    }


}