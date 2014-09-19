
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;


// C++: class CvGBTreesParams

/**
 * <p>GBT training parameters.</p>
 * <p/>
 * <p>The structure contains parameters for each single decision tree in the
 * ensemble, as well as the whole model characteristics. The structure is
 * derived from "CvDTreeParams" but not all of the decision tree parameters are
 * supported: cross-validation, pruning, and class priorities are not used.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/ml/doc/gradient_boosted_trees.html#cvgbtreesparams">org.opencv.ml.CvGBTreesParams : public CvDTreeParams</a>
 */
public class CvGBTreesParams extends CvDTreeParams {

    protected CvGBTreesParams(long addr) {
        super(addr);
    }


    //
    // C++:   CvGBTreesParams::CvGBTreesParams()
    //

    /**
     * <p>By default the following constructor is used: CvGBTreesParams(CvGBTrees.SQUARED_LOSS,
     * 200, 0.8f, 0.01f, 3, false) <code></p>
     * <p/>
     * <p>// C++ code:</p>
     * <p/>
     * <p>: CvDTreeParams(3, 10, 0, false, 10, 0, false, false, 0)</p>
     *
     * @see <a href="http://docs.opencv.org/modules/ml/doc/gradient_boosted_trees.html#cvgbtreesparams-cvgbtreesparams">org.opencv.ml.CvGBTreesParams.CvGBTreesParams</a>
     */
    public CvGBTreesParams() {

        super(CvGBTreesParams_0());

        return;
    }


    //
    // C++: int CvGBTreesParams::weak_count
    //

    // C++:   CvGBTreesParams::CvGBTreesParams()
    private static native long CvGBTreesParams_0();


    //
    // C++: void CvGBTreesParams::weak_count
    //

    // C++: int CvGBTreesParams::weak_count
    private static native int get_weak_count_0(long nativeObj);


    //
    // C++: int CvGBTreesParams::loss_function_type
    //

    // C++: void CvGBTreesParams::weak_count
    private static native void set_weak_count_0(long nativeObj, int weak_count);


    //
    // C++: void CvGBTreesParams::loss_function_type
    //

    // C++: int CvGBTreesParams::loss_function_type
    private static native int get_loss_function_type_0(long nativeObj);


    //
    // C++: float CvGBTreesParams::subsample_portion
    //

    // C++: void CvGBTreesParams::loss_function_type
    private static native void set_loss_function_type_0(long nativeObj, int loss_function_type);


    //
    // C++: void CvGBTreesParams::subsample_portion
    //

    // C++: float CvGBTreesParams::subsample_portion
    private static native float get_subsample_portion_0(long nativeObj);


    //
    // C++: float CvGBTreesParams::shrinkage
    //

    // C++: void CvGBTreesParams::subsample_portion
    private static native void set_subsample_portion_0(long nativeObj, float subsample_portion);


    //
    // C++: void CvGBTreesParams::shrinkage
    //

    // C++: float CvGBTreesParams::shrinkage
    private static native float get_shrinkage_0(long nativeObj);

    // C++: void CvGBTreesParams::shrinkage
    private static native void set_shrinkage_0(long nativeObj, float shrinkage);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public int get_weak_count() {

        int retVal = get_weak_count_0(nativeObj);

        return retVal;
    }

    public void set_weak_count(int weak_count) {

        set_weak_count_0(nativeObj, weak_count);

        return;
    }

    public int get_loss_function_type() {

        int retVal = get_loss_function_type_0(nativeObj);

        return retVal;
    }

    public void set_loss_function_type(int loss_function_type) {

        set_loss_function_type_0(nativeObj, loss_function_type);

        return;
    }

    public float get_subsample_portion() {

        float retVal = get_subsample_portion_0(nativeObj);

        return retVal;
    }

    public void set_subsample_portion(float subsample_portion) {

        set_subsample_portion_0(nativeObj, subsample_portion);

        return;
    }

    public float get_shrinkage() {

        float retVal = get_shrinkage_0(nativeObj);

        return retVal;
    }

    public void set_shrinkage(float shrinkage) {

        set_shrinkage_0(nativeObj, shrinkage);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
