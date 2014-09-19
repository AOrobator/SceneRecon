
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.TermCriteria;

// C++: class CvSVMParams

/**
 * <p>SVM training parameters.</p>
 * <p/>
 * <p>The structure must be initialized and passed to the training method of
 * "CvSVM".</p>
 *
 * @see <a href="http://docs.opencv.org/modules/ml/doc/support_vector_machines.html#cvsvmparams">org.opencv.ml.CvSVMParams</a>
 */
public class CvSVMParams {

    protected final long nativeObj;

    protected CvSVMParams(long addr) {
        nativeObj = addr;
    }


    //
    // C++:   CvSVMParams::CvSVMParams()
    //

    /**
     * <p>The constructors.</p>
     * <p/>
     * <p>The default constructor initialize the structure with following values:</p>
     * <p/>
     * <p><code></p>
     * <p/>
     * <p>// C++ code:</p>
     * <p/>
     * <p>CvSVMParams.CvSVMParams() :</p>
     * <p/>
     * <p>svm_type(CvSVM.C_SVC), kernel_type(CvSVM.RBF), degree(0),</p>
     * <p/>
     * <p>gamma(1), coef0(0), C(1), nu(0), p(0), class_weights(0)</p>
     * <p/>
     * <p/>
     * <p>term_crit = cvTermCriteria(CV_TERMCRIT_ITER+CV_TERMCRIT_EPS, 1000,
     * FLT_EPSILON);</p>
     *
     * @see <a href="http://docs.opencv.org/modules/ml/doc/support_vector_machines.html#cvsvmparams-cvsvmparams">org.opencv.ml.CvSVMParams.CvSVMParams</a>
     */
    public CvSVMParams() {

        nativeObj = CvSVMParams_0();

        return;
    }


    //
    // C++: int CvSVMParams::svm_type
    //

    // C++:   CvSVMParams::CvSVMParams()
    private static native long CvSVMParams_0();


    //
    // C++: void CvSVMParams::svm_type
    //

    // C++: int CvSVMParams::svm_type
    private static native int get_svm_type_0(long nativeObj);


    //
    // C++: int CvSVMParams::kernel_type
    //

    // C++: void CvSVMParams::svm_type
    private static native void set_svm_type_0(long nativeObj, int svm_type);


    //
    // C++: void CvSVMParams::kernel_type
    //

    // C++: int CvSVMParams::kernel_type
    private static native int get_kernel_type_0(long nativeObj);


    //
    // C++: double CvSVMParams::degree
    //

    // C++: void CvSVMParams::kernel_type
    private static native void set_kernel_type_0(long nativeObj, int kernel_type);


    //
    // C++: void CvSVMParams::degree
    //

    // C++: double CvSVMParams::degree
    private static native double get_degree_0(long nativeObj);


    //
    // C++: double CvSVMParams::gamma
    //

    // C++: void CvSVMParams::degree
    private static native void set_degree_0(long nativeObj, double degree);


    //
    // C++: void CvSVMParams::gamma
    //

    // C++: double CvSVMParams::gamma
    private static native double get_gamma_0(long nativeObj);


    //
    // C++: double CvSVMParams::coef0
    //

    // C++: void CvSVMParams::gamma
    private static native void set_gamma_0(long nativeObj, double gamma);


    //
    // C++: void CvSVMParams::coef0
    //

    // C++: double CvSVMParams::coef0
    private static native double get_coef0_0(long nativeObj);


    //
    // C++: double CvSVMParams::C
    //

    // C++: void CvSVMParams::coef0
    private static native void set_coef0_0(long nativeObj, double coef0);


    //
    // C++: void CvSVMParams::C
    //

    // C++: double CvSVMParams::C
    private static native double get_C_0(long nativeObj);


    //
    // C++: double CvSVMParams::nu
    //

    // C++: void CvSVMParams::C
    private static native void set_C_0(long nativeObj, double C);


    //
    // C++: void CvSVMParams::nu
    //

    // C++: double CvSVMParams::nu
    private static native double get_nu_0(long nativeObj);


    //
    // C++: double CvSVMParams::p
    //

    // C++: void CvSVMParams::nu
    private static native void set_nu_0(long nativeObj, double nu);


    //
    // C++: void CvSVMParams::p
    //

    // C++: double CvSVMParams::p
    private static native double get_p_0(long nativeObj);


    //
    // C++: TermCriteria CvSVMParams::term_crit
    //

    // C++: void CvSVMParams::p
    private static native void set_p_0(long nativeObj, double p);


    //
    // C++: void CvSVMParams::term_crit
    //

    // C++: TermCriteria CvSVMParams::term_crit
    private static native double[] get_term_crit_0(long nativeObj);

    // C++: void CvSVMParams::term_crit
    private static native void set_term_crit_0(long nativeObj, int term_crit_type, int term_crit_maxCount, double term_crit_epsilon);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public int get_svm_type() {

        int retVal = get_svm_type_0(nativeObj);

        return retVal;
    }

    public void set_svm_type(int svm_type) {

        set_svm_type_0(nativeObj, svm_type);

        return;
    }

    public int get_kernel_type() {

        int retVal = get_kernel_type_0(nativeObj);

        return retVal;
    }

    public void set_kernel_type(int kernel_type) {

        set_kernel_type_0(nativeObj, kernel_type);

        return;
    }

    public double get_degree() {

        double retVal = get_degree_0(nativeObj);

        return retVal;
    }

    public void set_degree(double degree) {

        set_degree_0(nativeObj, degree);

        return;
    }

    public double get_gamma() {

        double retVal = get_gamma_0(nativeObj);

        return retVal;
    }

    public void set_gamma(double gamma) {

        set_gamma_0(nativeObj, gamma);

        return;
    }

    public double get_coef0() {

        double retVal = get_coef0_0(nativeObj);

        return retVal;
    }

    public void set_coef0(double coef0) {

        set_coef0_0(nativeObj, coef0);

        return;
    }

    public double get_C() {

        double retVal = get_C_0(nativeObj);

        return retVal;
    }

    public void set_C(double C) {

        set_C_0(nativeObj, C);

        return;
    }

    public double get_nu() {

        double retVal = get_nu_0(nativeObj);

        return retVal;
    }

    public void set_nu(double nu) {

        set_nu_0(nativeObj, nu);

        return;
    }

    public double get_p() {

        double retVal = get_p_0(nativeObj);

        return retVal;
    }

    public void set_p(double p) {

        set_p_0(nativeObj, p);

        return;
    }

    public TermCriteria get_term_crit() {

        TermCriteria retVal = new TermCriteria(get_term_crit_0(nativeObj));

        return retVal;
    }

    public void set_term_crit(TermCriteria term_crit) {

        set_term_crit_0(nativeObj, term_crit.type, term_crit.maxCount, term_crit.epsilon);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
